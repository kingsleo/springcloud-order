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
 * @CreateDate: 2018/8/16 下午9:30
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
