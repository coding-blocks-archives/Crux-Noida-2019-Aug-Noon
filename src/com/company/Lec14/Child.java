package com.company.Lec14;

public class Child {
    public static void main(String[] args) {


        Human mohit = new Human(10000);
        mohit.name="Mohit";
        System.out.println(mohit.name);

        mohit.loan();
        mohit.loan();
        mohit.loan();
        int ar[]= new int[3];
//        ar.length=50;

        Human rohit=new Human();
        rohit.name="Rohit";
        System.out.println(rohit.balance);

    }
}
