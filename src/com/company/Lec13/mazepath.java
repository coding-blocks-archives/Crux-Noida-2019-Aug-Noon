package com.company.Lec13;

public class mazepath {

    public static void main(String[] args) {
        System.out.println(mazepath(3,3,""));
    }

    public static int  mazepath(int row,int col, String processed){

        if(row==1 && col==1){
            System.out.println(processed);
            return 1;
        }

    int cnt =0;

        if(row>1){

                cnt+= mazepath(row-1,col,processed+"V");
                }

                if(col>1){
                cnt+=mazepath(row,col-1,processed+"H");
                }
                return cnt;
                }

    public static void keypad(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

         int digit= unprocessed.charAt(0)-'0';
        unprocessed=unprocessed.substring(1);

        for (int i = (digit-1)*3; i <digit*3 ; i++) {

            if(i==26){
                continue;
            }

            char ch=(char)(i+'a');
            keypad(processed+ch,unprocessed);
        }
    }
}
