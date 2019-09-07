package com.company.Lect4;

import java.util.Scanner;

public class functionseg {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int start =s.nextInt();
        int end =s.nextInt();
        int step =s.nextInt();

        ftoc(start,end,step);
    }

    public static void ftoc(int start, int end , int step){

        while(start<=end){

            int c= (int) ((5f/9)*(start-32));
            System.out.println(c);
            start=start+step;
        }
    }
}
