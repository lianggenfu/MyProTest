package Hash.HashMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONObjectTest {

    public static void main(String[] args) {

        String t = "{\n" +
                "  \"data\": {\n" +
                "    \"city\": \"深圳\",\n" +
                "    \"temphigh\": \"25\",\n" +
                "    \"templow\": \"19\",\n" +
                "    \"updatetime\": \"2017-11-04 13:23:00\",\n" +
                "    \"tempnow\": \"24\",\n" +
                "    \"sendibletemp\": \"27\",\n" +
                "    \"winddirect\": \"东北风\",\n" +
                "    \"windpower\": \"2级\",\n" +
                "    \"humidity\": \"42\",\n" +
                "    \"sunrise\": \"06:29\",\n" +
                "    \"sunset\": \"17:45\",\n" +
                "    \"weather\": \"多云\",\n" +
                "    \"week\": \"星期六\",\n" +
                "    \"nl\": null,\n" +
                "    \"date\": \"2017-11-04\",\n" +
                "    \"index\": [\n" +
                "      {\n" +
                "        \"name\": \"化妆指数\",\n" +
                "        \"level\": \"控油\",\n" +
                "        \"msg\": \"建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"感冒指数\",\n" +
                "        \"level\": \"易发\",\n" +
                "        \"msg\": \"感冒容易发生，少去人群密集的场所有利于降低感冒的几率。\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"洗车指数\",\n" +
                "        \"level\": \"不宜\",\n" +
                "        \"msg\": \"雨(雪)水和泥水会弄脏您的爱车，不适宜清洗车辆。\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"穿衣指数\",\n" +
                "        \"level\": \"舒适\",\n" +
                "        \"msg\": \"白天温度适中，但早晚凉，易穿脱的便携外套很实用。\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"紫外线强度指数\",\n" +
                "        \"level\": \"弱\",\n" +
                "        \"msg\": \"辐射较弱，涂擦SPF12-15、PA+护肤品。\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"运动指数\",\n" +
                "        \"level\": \"不适宜\",\n" +
                "        \"msg\": \"受到阵雨天气的影响，不宜在户外运动。\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"pm25\": {\n" +
                "      \"aqi\": 0,\n" +
                "      \"co\": 8,\n" +
                "      \"o3\": 42,\n" +
                "      \"pm10\": 63,\n" +
                "      \"pm2_5\": 64,\n" +
                "      \"quality\": \"良\",\n" +
                "      \"so2\": 4,\n" +
                "      \"no2\": 11,\n" +
                "      \"updatetime\": \"2017-11-04 13:00:00\"\n" +
                "    },\n" +
                "    \"daily\": [\n" +
                "      {\n" +
                "        \"date\": \"2017-11-04\",\n" +
                "        \"week\": \"星期六\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"25\",\n" +
                "        \"templow\": \"19\",\n" +
                "        \"weather\": \"多云\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"date\": \"2017-11-05\",\n" +
                "        \"week\": \"星期日\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"26\",\n" +
                "        \"templow\": \"19\",\n" +
                "        \"weather\": \"多云\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"date\": \"2017-11-06\",\n" +
                "        \"week\": \"星期一\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"27\",\n" +
                "        \"templow\": \"20\",\n" +
                "        \"weather\": \"多云\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"date\": \"2017-11-07\",\n" +
                "        \"week\": \"星期二\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"28\",\n" +
                "        \"templow\": \"21\",\n" +
                "        \"weather\": \"多云\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"date\": \"2017-11-08\",\n" +
                "        \"week\": \"星期三\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"29\",\n" +
                "        \"templow\": \"22\",\n" +
                "        \"weather\": \"多云\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"date\": \"2017-11-09\",\n" +
                "        \"week\": \"星期四\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"28\",\n" +
                "        \"templow\": \"22\",\n" +
                "        \"weather\": \"多云\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"date\": \"2017-11-03\",\n" +
                "        \"week\": \"星期五\",\n" +
                "        \"sunrise\": \"06:29\",\n" +
                "        \"sunset\": \"17:45\",\n" +
                "        \"temphigh\": \"28\",\n" +
                "        \"templow\": \"18\",\n" +
                "        \"weather\": \"晴\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"status\": 0,\n" +
                "  \"msg\": \"ok\"\n" +
                "}";

        JSONObject jasonObject = JSONObject.parseObject(t);
        String value = jasonObject.getJSONObject("data").getJSONArray("index").getString(1);

        JSONObject jsonData = jasonObject.getJSONObject("data");
        JSONArray jsonIndex =jsonData.getJSONArray("index");
        JSONArray jsonDaily =jsonData.getJSONArray("daily");

        String s1 = jsonIndex.getString(0);


        System.out.println(jsonData);
        System.out.println(jsonIndex);
        System.out.println(jsonDaily);
        System.out.println(s1);
    }
}
