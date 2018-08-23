package com.fb.order.utils;

import java.util.Random;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.utils
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/16 下午7:58
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer num = random.nextInt(900000) + 10000;
        return System.currentTimeMillis() + String.valueOf(num);
    }
}
