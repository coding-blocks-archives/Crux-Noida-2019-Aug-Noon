package com.company.Lect8;

public class Recursioneg {

    public static void main(String[] args) {
        pd(5);

        System.out.println(fact(4));

        System.out.println(fibo(4));
    }

    public static void pd(int n){
        if(n==0){
            return;
        }


        pd(n-1);
        System.out.println(n);
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

}
