package com.fb.order.service.impl;

import com.fb.order.client.ProductClient;
import com.fb.order.dataobject.OrderDetail;
import com.fb.order.dataobject.OrderMaster;
import com.fb.order.dataobject.ProductInfo;
import com.fb.order.dto.CartDTO;
import com.fb.order.dto.OrderDTO;
import com.fb.order.enums.OrderStatus;
import com.fb.order.enums.PayStatus;
import com.fb.order.repository.OrderDetailRepository;
import com.fb.order.repository.OrderMasterRepository;
import com.fb.order.service.OrderService;
import com.fb.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.service.impl
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 下午7:54
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private ProductClient productClient;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        String orderId = KeyUtil.genUniqueKey();

        /**
         * 查询商品信息
         */
        List<Long> productIdList = orderDTO.getOrderDetailList().stream()
                .map(OrderDetail::getProductId)
                .collect(Collectors.toList());
        List<ProductInfo> productInfoList = productClient.listForOrder(productIdList);

        /**
         * 计算总价
         */
        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList()) {
            for (ProductInfo productInfo : productInfoList) {
                if (orderDetail.getProductId().equals(productInfo.getProductId())) {
                    // 单价乘以数量
                    orderAmount = productInfo.getProductPrice()
                            .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                            .add(orderAmount);
                    BeanUtils.copyProperties(productInfo, orderDetail);
                    orderDetail.setOrderId(orderId);
                    orderDetail.setDetailId(KeyUtil.genUniqueKey());
                    // 订单详情入库
                    orderDetailRepository.save(orderDetail);
                }

            }
        }

        /**
         * 扣库存
         */
        List<CartDTO> cartDTOList = orderDTO.getOrderDetailList().stream()
                .map(e -> new CartDTO(e.getProductId(), e.getProductQuantity()))
                .collect(Collectors.toList());
        productClient.productDecreaseStock(cartDTOList);

        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(orderId);
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setPayStatus(PayStatus.WAIT.getCode());
        orderMaster.setOrderStatus(OrderStatus.NEW.getCode());
        orderMaster.setBuyerPhone(orderDTO.getBuyerPhone());
        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
