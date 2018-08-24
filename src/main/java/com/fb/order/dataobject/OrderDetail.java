package com.fb.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.dataobject
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 上午10:12
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
@Entity
public class OrderDetail {

    @Id
    private String detailId;

    private String orderId;

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productIcon;
}
