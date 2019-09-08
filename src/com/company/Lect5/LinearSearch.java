package com.company.Lect5;

public class LinearSearch {

    public static void main(String[] args) {

    }

    public static int linear(int ar[],int element){

        for (int i = 0; i <ar.length ; i++) {
            if(element==ar[i]){
                    return i;
            }
        }
        return -1;
    }
}
