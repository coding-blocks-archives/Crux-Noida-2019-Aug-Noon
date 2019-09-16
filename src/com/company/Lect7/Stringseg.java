package com.company.Lect7;

public class Stringseg {

    public static void main(String[] args) {

        String line= "helloool";
        String s="hello";

        System.out.println(line.equals(s));

        System.out.println(line.charAt(0));
        System.out.println(line.substring(1,4));

        System.out.println(line.indexOf('l',4));
//
//        line=line+s;
//        line= "hello";

//        System.out.println(line);

    }

    public static void substring(String str){
        for (int i = 0; i <str.length() ; i++) {

            for (int j = i+1; j <=str.length() ; j++) {

                System.out.println(str.substring(i,j));
            }
        }
    }

    public static boolean palindrome(String str){

        int start=0;
        int end=str.length()-1;

        while(start<end){

            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
