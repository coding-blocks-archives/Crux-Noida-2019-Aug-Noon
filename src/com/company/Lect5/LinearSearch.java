package com.company.Lect5;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
//        int ar[]={1,2,3,4,5};
        Scanner s= new Scanner(System.in);
        int ar[]=new int[5];

        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ar));

        System.out.println(binary(ar,3));
    }

    public static int linear(int ar[],int element){

        for (int i = 0; i <ar.length ; i++) {
            if(element==ar[i]){
                    return i;
            }
        }
        return -1;
    }


    public static int binary(int ar[],int element){

        int start=0;

        int end= ar.length-1;

        while(start<=end) {

            int mid = (start + end) / 2;

            if (ar[mid] == element) {
                return mid;
            } else
                if (ar[mid] > element) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
        }
        return -1;
    }
}
