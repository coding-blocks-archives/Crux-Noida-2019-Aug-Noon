package com.company.Lect5;

import java.util.Arrays;

public class Util {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};

        System.out.println(Arrays.toString(ar));

        swap(ar,2,3);

        System.out.println(Arrays.toString(ar));

    }

    public static void swap(int ar[],int first,int second){

        int temp=ar[first];
        ar[first]=ar[second];
        ar[second]=temp;
    }

   public static int max(int ar[]){

        int max=ar[0];

       for (int i = 1; i <ar.length ; i++) {

           if(max<ar[i]){
               max=ar[i];
           }
       }
       return max;
   }

    public static int maxindex(int ar[]){

        int max=0;

        for (int i = 1; i <ar.length ; i++) {

            if(ar[max]<ar[i]){
                max=i;
            }
        }
        return max;
    }


}
