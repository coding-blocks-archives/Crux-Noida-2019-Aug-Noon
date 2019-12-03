package com.company.Lec26;

public class Dicecount {

    public static void main(String[] args) {

        int n=4;

        int mem[]= new int[n+1];
        System.out.println(DiceItr(4,6,mem));
    }

    public static int dicecount(int target,int faces){

        if(target==0){
            return 1;
        }

        int cnt=0;

        for (int i = 1; i <=faces && i<=target ; i++) {

            cnt+=dicecount(target-i,faces);
        }
        return cnt;
    }

    public static int dicecountDp(int target,int faces, Integer[] mem){

        if(target==0){
            return 1;
        }

        if(mem[target]!=null){
            return mem[target];
        }

        int cnt=0;

        for (int i = 1; i <=faces && i<=target; i++) {

            cnt+=dicecountDp(target-i,faces,mem);

        }
        mem[target]=cnt;

        return mem[target];
    }

    public static int DiceItr(int target, int faces, int mem[]){

        mem[0]=1;

        for (int i = 1; i <=target ; i++) {

            for (int j = 1; j <=faces && j<=i ; j++) {

                mem[i]=mem[i]+ mem[i-j];
            }
        }

       return mem[target];
    }


}
