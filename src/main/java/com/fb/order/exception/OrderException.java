package com.fb.order.exception;

import com.fb.order.enums.ResultEnum;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.exception
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 下午9:22
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
