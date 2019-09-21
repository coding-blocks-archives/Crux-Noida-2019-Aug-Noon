package com.company.Lect8;

public class Recarrayeg {

    public static void main(String[] args) {

        int ar[]={1,2,5,4};
        System.out.println(sorted(ar,0));
    }

    public static boolean sorted(int ar[], int index){

        if(index==ar.length-1){
            return true;
        }

        if(ar[index]>ar[index+1]){
            return false;
        }

        return sorted(ar,index+1);
    }


}
