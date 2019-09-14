package com.company.Lec6;

import java.util.ArrayList;

public class ArrayListeg {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList();
        int ar[]=new int[5];
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));
        System.out.println(list.indexOf(2));
//        list.set(3,6);
        System.out.println(ar);
        System.out.println(list);

    }
}
