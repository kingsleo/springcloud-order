package com.fb.order.dto;

import lombok.Data;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.product.dto
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/22 下午2:12
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
public class CartDTO {

    /**
     * 商品Id
     */
    private Long productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(Long productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
