package com.company.Lec13;

public class BItmask {

    public static void main(String[] args) {
        oddeven(10);
    }

    public static void oddeven(int n){

        if((n&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }


    public static void unique(int ar[]){

        int m=ar[0];

        for (int i = 1; i <ar.length ; i++) {
            m=m^ar[i];
        }

        System.out.println(m);
    }

    public static int setbitcount(int n){

        int cnt=0;
        while(n!=0){

            if((n&1)==1){
                cnt++;
            }
            n=n>>1;
        }
        return cnt;
    }

    public static int setBit(int n, int i){

        int mask= 1<<i;

        return n|mask;
    }

    public static int offBit(int n, int i){

        int mask= ~(1<<i);

        return (n&mask);
    }

    //Incredible Hulk problem same as countsetbits

    //Subsequence problem discussed

    // 2 Unique no. problem discussed
}
