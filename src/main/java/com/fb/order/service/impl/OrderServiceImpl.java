package com.fb.order.service.impl;

import com.fb.order.dataobject.OrderMaster;
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

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setPayStatus(PayStatus.WAIT.getCode());
        orderMaster.setOrderStatus(OrderStatus.NEW.getCode());
        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
