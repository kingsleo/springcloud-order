package com.fb.order.utils;

import com.fb.order.VO.ResultVO;

/**
 * java类简单作用描述
 *
 * @ProjectName: order
 * @Package: com.fb.order.utils
 * @ClassName:
 * @Description:
 * @Author: zhenglinyong
 * @CreateDate: 2018/8/17 下午2:44
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

}
