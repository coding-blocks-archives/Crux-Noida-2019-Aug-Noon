package com.company.Lect5;

import java.util.Arrays;

public class sort {

    public static void main(String[] args) {

        int ar[]={5,4,3,2,1};

        bubblesort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int ar[]){

        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar.length-i-1 ; j++) {

                if(ar[j]>ar[j+1]){
                    Util.swap(ar,j,j+1);
                }
            }
        }
    }
}
