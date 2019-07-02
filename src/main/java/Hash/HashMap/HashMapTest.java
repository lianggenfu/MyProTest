package Hash.HashMap;

import java.util.*;

/*
* HashMap遍历的几种方式
* */
public class HashMapTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        map.put("4","D");
        map.put("5","A");
        map.put("9","A");

        /*
        * 第一种，遍历value值
        * */
       // ergodicHashMapValue(map);

        /*
         * 第二种，遍历key值
         * */
        //ergodicHashMapKey(map);

        /*
        * 第三种 遍历取key和value
        * */
       // ergodicHashMapKeyAndValue(map);


        /*
        * 第四种  根据value取key值
        * */
        getKeyByValue(map);
    }

    private static void getKeyByValue(Map<String, String> map) {
        for (Map.Entry me : map.entrySet()){
            if(me.getValue()=="A"){
                System.out.println(me.getKey());
            }
        }
    }

    private static void ergodicHashMapKeyAndValue(Map<String, String> map) {
        Set<Map.Entry<String,String>> sms = map.entrySet();
        Iterator<Map.Entry<String,String>> iterator = sms.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void ergodicHashMapKey(Map<String, String> map) {
        Set<String> set = map.keySet();
        for(String s : set){
            System.out.println(s);
        }
    }

    private static void ergodicHashMapValue(Map<String, String> map) {
        Collection<String> collection = map.values();
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
