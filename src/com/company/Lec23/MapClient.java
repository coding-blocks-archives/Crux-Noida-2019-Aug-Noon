package com.company.Lec23;

public class MapClient {

    public static void main(String[] args) {
        MapusingArraylist map = new MapusingArraylist();
        map.put("apple","theek he");
        map.put("orange","mast he");
        map.put("Tarun","Googlewala");

        System.out.println(map.get("apple"));
        System.out.println(map.get("orange"));
        System.out.println(map.get("Tarun"));

        System.out.println(map.toString());

    }
}
