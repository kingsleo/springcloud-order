package com.fb.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * java类简单作用描述
 *
 * @ProjectName: product
 * @Package: com.fb.product.dataobject
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/14 下午12:42
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
@Entity
public class ProductInfo {

    @Id
    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
