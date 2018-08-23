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
 * @CreateDate: 2018/8/16 上午10:28
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Getter
public enum OrderStatus {
    NEW(0, "新订单"),
    FINISHED(1, "已完成"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
