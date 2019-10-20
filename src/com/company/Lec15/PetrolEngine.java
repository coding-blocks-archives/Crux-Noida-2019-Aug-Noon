package com.company.Lec15;

public class PetrolEngine extends Engine {

    int accspeed=60;


    public void start(){
        System.out.println("I start like a petrol engine");
    }

//    @Override
//    public void fun() {
//        System.out.println("Hurray Hurray");
//    }

    public void makenoise(){
        System.out.println("hurr hurr");
    }


    public void speed(){
        System.out.println("speed");
    }

    public void speed(int a){
        System.out.println("speed");
    }

    public static void gear(){
        System.out.println("gear child");
    }
}
