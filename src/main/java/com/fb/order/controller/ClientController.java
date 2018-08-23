package com.fb.order.controller;

import com.fb.order.client.ProductClient;
import com.fb.order.dataobject.ProductInfo;
import com.fb.order.dto.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.controller
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/17 下午4:03
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@RestController
public class ClientController {

    //配合第二种方式
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

    // 配合第三种方式
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        // 1.第一种方式
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/service/msg", String.class);
//        return response;

        // 2.第二种方式
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s/service/msg", serviceInstance.getHost(), serviceInstance.getPort());
//        String response = restTemplate.getForObject(url, String.class);
//        return response;

        // 3.第三种方式
//        String response = restTemplate.getForObject("http://PRODUCT/service/msg", String.class);

        // 第四种方式(Feigon)
        String response = productClient.productMsg();
        return response;
    }

    @PostMapping("/getListForOrder")
    public List<ProductInfo> getListForOrder() {
        List<ProductInfo> list = productClient.listForOrder(Arrays.asList(1L, 2L));
        return list;
    }

    @PostMapping("/productDecreaseStock")
    public String productDecreaseStock() {
        productClient.productDecreaseStock(Arrays.asList(new CartDTO(1L, 1)));
        return "ok";
    }

}
