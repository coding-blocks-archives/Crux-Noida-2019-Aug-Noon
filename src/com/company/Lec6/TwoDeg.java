package com.company.Lec6;

import java.util.Scanner;

public class TwoDeg {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[][] =new int[2][3];

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {

                ar[i][j]=s.nextInt();
            }
        }

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {

                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }


    public static void horizontalwave(int ar[][]){

        for (int i = 0; i <ar.length ; i++) {

            if(i%2==0){

                for (int j = 0; j <ar[i].length ; j++) {
                    System.out.println(ar[i][j]);
                }
            }
            else{
                for (int j = ar[i].length-1; j >=0 ; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }
}
