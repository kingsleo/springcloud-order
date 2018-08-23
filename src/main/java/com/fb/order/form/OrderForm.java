package com.fb.order.form;

import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.form
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 下午9:19
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;
}
