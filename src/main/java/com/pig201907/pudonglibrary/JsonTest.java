package com.pig201907.pudonglibrary;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonTest {

    public static void main(String[] args) {
        parseJsonObject();
    }

    public static void parseJsonObject()
    {
        String text = "{\"age\":105,\"id\":\"testFastJson001\",\"name\":\"maks\"}";
        JSONObject json = JSON.parseObject(text);
        System.out.println("parseJsonObject()方法：json==" + json);
        // 输出结果：json=={"age":105,"id":"testFastJson001","name":"maks"}
    }
}
