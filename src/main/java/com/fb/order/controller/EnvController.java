package com.fb.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.order.controller
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/26 下午4:13
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@RestController
@RequestMapping("/dev")
@RefreshScope
public class EnvController {

    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String print() {
        return env;
    }
}
