package com.company.Lec16;

public class ArrayListClient {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);

        for (int i = 0; i < 12; i++) {
            list.add(i);
        }

        for (int i = 0; i <10; i++) {
            System.out.println(list.remove());
        }
    }
}
