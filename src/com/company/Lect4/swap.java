package com.company.Lect4;

public class swap {

    public static void main(String[] args) {

        int a=6;
        int b=5;
        swapque(a,b);
        System.out.println(a+" "+b);
        a=swapque(a,b);
    }

    public static int swapque(int a,int b){

        int temp=a;
        a=b;
        b=temp;

        return a;
    }
}
