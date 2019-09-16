package com.company.Lect7;

public class StringBuildereg {

    public static void main(String[] args) {

        String str="abc";
        StringBuilder builder= new StringBuilder();

        for (int i = 0; i <10000000 ; i++) {

//            str=str+'a';

            builder.append('a');
        }
        System.out.println(toggle("HellO"));
        System.out.println(asciidiff(str));
    }

    public static StringBuilder toggle(String s){

        StringBuilder builder =new StringBuilder(s);

        for (int i = 0; i <s.length(); i++) {

            char ch=s.charAt(i);

            if(ch >='a' && ch <='z'){
                ch= (char) (ch-32);
            }

            else{
                ch=(char) (ch+32);
            }
            builder.setCharAt(i,ch);
        }
        return builder;
    }

    public static StringBuilder asciidiff(String str){

        StringBuilder builder= new StringBuilder();

        builder.append(str.charAt(0));


        for (int i = 1; i <str.length() ; i++) {

            char ch= str.charAt(i);

            char ch1=str.charAt(i-1);

            int diff= Math.abs(ch-ch1);

            builder.append(diff);
            builder.append(ch);
        }
        return builder;
    }

}
