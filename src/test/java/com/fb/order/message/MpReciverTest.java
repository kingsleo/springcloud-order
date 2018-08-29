package com.fb.order.message;

import com.fb.order.OrderApplicationTests;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.order.message
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/27 下午5:17
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Component
public class MpReciverTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void process() throws Exception {
        amqpTemplate.convertAndSend("myQueue", "now() " + new Date());
    }

    @Test
    public void processComputer() throws Exception {
        amqpTemplate.convertAndSend("myOrder", "computer", "now() " + new Date());
    }

    @Test
    public void processFruit() throws Exception {
        amqpTemplate.convertAndSend("myOrder", "fruit", "now() " + new Date());
    }

}