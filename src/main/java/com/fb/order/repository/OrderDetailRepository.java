package com.fb.order.repository;

import com.fb.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.repository
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 上午10:18
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
