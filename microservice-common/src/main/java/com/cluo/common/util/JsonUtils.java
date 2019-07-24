package com.cluo.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/7/22 15:40
 */
public class JsonUtils {
    /**
     * json转为Map
     * @param jsonStr
     * @return
     */
    public static Map jsonTransMap(String jsonStr){
        Map map = new HashMap<>();
        com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(jsonStr);
        for(Map.Entry<String, Object> entrySet : jsonObject.entrySet()) {
            map.put(entrySet.getKey(), entrySet.getValue());
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "{\"id\":\"01\",\"name\":\"cluo\"}";
        Map<String, Object> map = jsonTransMap(str);
        System.out.println(map);
    }
}
