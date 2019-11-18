package com.company.Lec22;

import java.util.HashMap;
import java.util.Map;

public class Hashmapeg {

    public static void main(String[] args) {

        Map<String,String> map= new HashMap<>();

        map.put("Shubham","Handsome");
        map.put("Ekta","Beautiful");
        map.put("Tarun","Googlewala");

        map.remove("Shubham");

        System.out.println(map.get("Shubham"));

        System.out.println(map);

        for (String key:map.keySet()) {
            System.out.println(key);
        }

        for (String value:map.values()) {
            System.out.println(value);
            }
    }

    public Map<Character,Integer> frequency(String str){

        Map<Character,Integer> map= new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch =str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
               map.put(ch,1);
            }

        }
        return map;
    }



}


