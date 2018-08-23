package com.fb.order.repository;

import com.fb.order.OrderApplicationTests;
import com.fb.order.dataobject.OrderMaster;
import com.fb.order.enums.OrderStatus;
import com.fb.order.enums.PayStatus;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.repository
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 上午10:23
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerAddress("虚拟地址");
        orderMaster.setBuyerName("虚拟用户");
        orderMaster.setBuyerOpenid("123");
        orderMaster.setBuyerPhone("123456");
        orderMaster.setOrderAmount(new BigDecimal(1.5));
        orderMaster.setOrderStatus(OrderStatus.NEW.getCode());
        orderMaster.setPayStatus(PayStatus.WAIT.getCode());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }

}