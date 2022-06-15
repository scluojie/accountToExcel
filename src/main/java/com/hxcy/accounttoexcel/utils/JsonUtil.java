package com.hxcy.accounttoexcel.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @author kevin
 * @date 2022/4/27
 * @desc
 */
public class JsonUtil {

    public static <T> String listToJson(List<T> listBean) {
        String jsons = JSON.toJSONString(listBean);
        return jsons;
    }
}
