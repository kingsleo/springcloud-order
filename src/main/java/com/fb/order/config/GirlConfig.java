package com.fb.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.order.config
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/27 上午12:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
@Component
@ConfigurationProperties("girl")
@RefreshScope
public class GirlConfig {

    private String name;

    private Integer age;
}
