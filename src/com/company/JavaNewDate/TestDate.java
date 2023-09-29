package com.company.JavaNewDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDate {

    public static void main(String[] args) {

        List<Map> mainArryList = new ArrayList<>();
        Map<String,String> map1 = new HashMap<String, String>() ;
        map1.put("name", "test");
        map1.put("roleStatus", "A");
        mainArryList.add(map1);
        Map<String,String> map2 = new HashMap<String, String>() ;
        map2.put("name", "test1");
        map2.put("roleStatus", "I");

        mainArryList.add(map2);

        List<Map> filterList = mainArryList.stream()
                .filter(item -> ((String) item.get("roleStatus")).equalsIgnoreCase("A"))
                .collect(Collectors.toList());

        System.out.println(filterList.size());


    }
}
