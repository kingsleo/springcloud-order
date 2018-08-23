package com.fb.order.enums;

import lombok.Getter;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.enums
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 上午10:32
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Getter
public enum PayStatus {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
