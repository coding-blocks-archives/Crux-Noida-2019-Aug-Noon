package com.company.Lec13;

public class Practice{

    public static void main(String[] args) {
        lexonum(0,100);
    }

    public static void lexonum(int digit,int target){

        if(digit>target){
            return;
        }

        System.out.println(digit);

        for (int i = 0; i <10 ; i++) {

            if(digit==0 && i==0){
                continue;
            }

            lexonum(digit*10+i,target);
        }


    }

}
