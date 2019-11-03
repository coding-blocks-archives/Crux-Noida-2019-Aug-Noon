package com.company.Lec18;



public class LinkedClient {

    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

//        list.insertfirst(10);
//        list.insertfirst(10);
//        list.insertfirst(20);
        list1.insertlast(10);
        list1.insertlast(20);
        list1.insertlast(40);
        list1.insertlast(50);
        list1.insertlast(60);
        list1.insertlast(5);

        LinkedList list3 = list1.mergesort(list1);
        list3.display();


//        System.out.println(list.mid());
//        list.insertlast(50);
//        System.out.println(list.deletefirst());
//        System.out.println(list.deletelast());

//        list.display();
//        System.out.println(list.r);
//        System.out.println(list.);
        list.display();
    }
}
