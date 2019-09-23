package com.company.Lect9;

public class mazepath {

    public static void main(String[] args) {
    mazepath(3,3,"");
    }

    public static void mazepath(int row,int col, String processed){

        if(row==1 && col==1){
            System.out.println(processed);
            return;
        }

        if(row>1){
            mazepath(row-1,col,processed+"V");
        }

        if(col>1){
            mazepath(row,col-1,processed+"H");
        }

    }
}
