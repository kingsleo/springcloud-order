package com.fb.order.message;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.order.message
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/27 下午4:54
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Slf4j
@Component
public class MpReciver {
    // 1.@RabbitListener(queues = "myQueue")
    // 2.自动创建队列
//    @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    // 3.绑定Exchanges
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "computer",
            value = @Queue("myQueue")
    ))
    public void processComputer(String message) {
        log.info("computer message:{} " + message);
    }

    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "fruit",
            value = @Queue("myQueue")
    ))
    public void processFruit(String message) {
        log.info("fruit message:{} " + message);
    }


}
