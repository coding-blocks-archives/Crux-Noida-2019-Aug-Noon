package com.company.Lec14;

public class Human {

    String name;
     int balance;

     public Human(){

         this(1000);

     }

     public Human(int balance){
         this("Anonymous",balance);
     }

     public Human(String name, int balance){
         this.balance=balance;
         this.name=name;
     }

    public void loan(){
        this.balance=balance;
        int t= this.balance/10;
        balance=balance-t;

        System.out.println("Haan me gareeb ho gya " + balance );
    }

    public void eat(){

        if(balance<100){
            System.out.println("Bhagle");
            return;
        }
        balance=balance-100;
        System.out.println("MUjhe khana do");
    }

    public static void fest(){

        System.out.println("Hurray Hurray");

//        loan();
    }
}
