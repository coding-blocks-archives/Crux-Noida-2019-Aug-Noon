package com.company.Lect11;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {

        int ar[]= {5,4,3,9,2,1};

        quicksort(ar,0, ar.length);
        System.out.println(Arrays.toString(ar));
    }

    public static void quicksort(int ar[], int start, int end){

        if(end <=start){
            return;
        }

        int pivot=end-1;

        pivot =pivotadjust(ar,start,pivot);

        quicksort(ar,start,pivot);
        quicksort(ar,pivot+1,end);
    }

    public static int pivotadjust(int[] ar, int start,int pivot){

        int j=start;

        for (int i = start; i <pivot ; i++) {
            if(ar[i]<ar[pivot]){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;

                j++;
            }
        }

        int temp=ar[pivot];
        ar[pivot]=ar[j];
        ar[j]=temp;

        return j;
    }
}
