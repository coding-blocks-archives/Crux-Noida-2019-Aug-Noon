package com.company.Lect9;

import com.company.Lect5.Util;

public class pattern {

    public static void main(String[] args) {
        int ar[]={5,3,1,4};
        patternprint(4,0);

        bubblesort(ar, ar.length-1,0);
    }

    public static void patternprint(int row,int col){

        if(row==0){
            return;
        }

        if(col==row){
            System.out.println();
            patternprint(row-1,0);
            return;
        }

        System.out.print("*");
        patternprint(row,col+1);
    }

    public static void bubblesort(int ar[],int row,int col){

        if(row==0){
            return;
        }

        if(col==row){

            bubblesort(ar,row-1,0);
            return;
        }


        if(ar[col]>ar[col+1]){
            Util.swap(ar,col,col+1);
        }


        bubblesort(ar,row,col+1);
    }
}
