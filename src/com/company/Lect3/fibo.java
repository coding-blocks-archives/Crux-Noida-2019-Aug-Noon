package com.company.Lect3;

import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {

        //This is the code for fibonacci
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
//        System.out.println(n);
        int f=0;
        int s1=1;
        while(n>0){
            int t=f+s1;
            f=s1;
            s1=t;
            n=n-1;
        }
        System.out.println(f);
    }
}
