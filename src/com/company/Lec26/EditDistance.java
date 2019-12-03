package com.company.Lec26;

public class EditDistance {

    public static void main(String[] args) {

        System.out.println(EditD("Ramaaa","Rama"));
    }

    public static int EditD(String s1, String s2){

        if(s1.length()==0){
            return s2.length();
        }

        if(s2.length()==0){
            return s1.length();
        }

        if(s1.charAt(0)==s2.charAt(0)){
            return EditD(s1.substring(1),s2.substring(1));
        }

        else{
            return 1+Math.min(Math.min(EditD(s1.substring(1),s2),EditD(s1,s2.substring(1))),EditD(s1.substring(1),s2.substring(1)));
        }
    }

    public static int EditItr(String s1, String s2, Integer[][] mem){

        for (int i = 0; i <=s1.length() ; i++) {

            for (int j = 0; j <=s2.length() ; j++) {

                if(i==0){
                    mem[i][j]=j;
                }

                if(j==0){
                    mem[i][j]=i;
                }

                else{

                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        mem[i][j]=mem[i-1][j-1];
                    }

                    else{
                        mem[i][j]= 1 +Math.min(mem[i-1][j],Math.min(mem[i][j-1],mem[i-1][j-1]));
                    }

                }
            }
        }
        return mem[s1.length()][s2.length()];
    }
}
