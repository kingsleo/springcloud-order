package com.fb.order.repository;

import com.fb.order.OrderApplicationTests;
import com.fb.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.repository
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 上午11:05
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests{

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("222222");
        orderDetail.setOrderId("123456");
        orderDetail.setProductIcon("http://ww.xom");
        orderDetail.setProductName("测试产品");
        orderDetail.setProductId(1L);
        orderDetail.setProductPrice(new BigDecimal(100));
        orderDetail.setProductQuantity(1);

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result != null);
    }

}