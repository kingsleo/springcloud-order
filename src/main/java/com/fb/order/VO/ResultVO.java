package com.fb.order.VO;

import lombok.Data;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.VO
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/17 下午2:31
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
