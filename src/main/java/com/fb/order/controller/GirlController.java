package com.fb.order.controller;

import com.fb.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @CreateDate: 2018/8/27 上午12:19
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/print")
    public String print() {
        return "name:" + girlConfig.getName() + " age:" + girlConfig.getAge();
    }
}
