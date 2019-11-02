package com.company.Lec17;

public class LinkedClient {

    public static void main(String[] args) {


        LinkedList list = new LinkedList();

//        list.insertfirst(10);
//        list.insertfirst(10);
//        list.insertfirst(20);
        list.insertlast(10);
        list.insertlast(40);
        list.insertlast(40);
        list.insertlast(30);
        list.insertlast(50);
//        list.insertlast(50);
//        System.out.println(list.deletefirst());
//        System.out.println(list.deletelast());
        list.duplicates();
//        list.display();
//        System.out.println(list.r);
//        System.out.println(list.);
        list.display();
    }
}
