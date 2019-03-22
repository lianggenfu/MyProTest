package com.pig20190315.grainger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Test2 {

    public static void main(String[] args) {

        List<Staff> staffList = Arrays.asList(
                new Staff("jack",18, new BigDecimal(5000)),
                new Staff("jerry",20, new BigDecimal(6000)),
                new Staff("cove",33, new BigDecimal(1000))
        );

        /* befor java8*/
        List<String> staffNameList = new ArrayList<>();
        for (Staff staff : staffList){
            staffNameList.add(staff.getName());
        }
        System.out.println(staffNameList);

        /*  java8 */
        List<String> nameList = staffList.stream().map(k->k.getName()).collect(Collectors.toList());

        System.out.println(nameList);
    }
}
