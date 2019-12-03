package com.company.Lec26;

public class Mazepath {


    public static void main(String[] args) {
        int row=3;
        int col=3;
        Integer mem[][]= new Integer[row+1][col+1];
        System.out.println(mazeItr(3,3,mem));
    }

    public static int maze(int row,int col){

        if(row==1 || col==1){
            return 1;
        }

        return maze(row-1,col)+maze(row,col-1);
    }

    public static int mazeDp(int row, int col, Integer[][] mem){

        if(row==1 || col==1){
            return 1;
        }

        if(mem[row][col]!=null){
            return mem[row][col];
        }

        mem[row][col]= mazeDp(row-1,col,mem)+mazeDp(row,col-1,mem);

        return mem[row][col];
    }

    public static int mazeItr(int row, int col, Integer[][] mem){


        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=col ; j++) {

                if(i==1 || j==1){
                    mem[i][j]=1;
                }

                else{
                    mem[i][j]= mem[i-1][j]+mem[i][j-1];
                }
            }
        }
        return mem[row][col];
    }
}
