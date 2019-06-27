package com.pig20190623.home;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapTest {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",31L);
        map.put("value","平凉站");

        /*if(map.get("id").equals(31L)){
            System.out.println("yes");
        }
        String name = map.get("value").toString();

        if(name!=null){
            System.out.println("yesyes");
        }

        System.out.println(map.get("id"));*/

        /*for (String string : map.keySet()){
            System.out.println(string);
        }*/

        Collection<Object> collection = map.values();
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
