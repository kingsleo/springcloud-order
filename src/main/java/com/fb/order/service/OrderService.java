package com.fb.order.service;

import com.fb.order.dto.OrderDTO;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.service
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 下午7:49
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
