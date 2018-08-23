package com.fb.order.client;

import com.fb.order.dataobject.ProductInfo;
import com.fb.order.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: eureka
 * @Package: com.fb.order.client
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/21 下午6:01
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("/service/msg")
    String productMsg();

    @GetMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<Long> productIdList);

    @PostMapping("/product/decreaseStock")
    String productDecreaseStock(@RequestBody List<CartDTO> cartDtos);
}
