package com.company.Lect5;

public class Converter {
    public static void main(String[] args) {

        int deci=1011;
//        int bin=decitobin(deci);
//        System.out.println(bin);

        System.out.println(anytodeci(deci,2));
    }


    public static int decitobin(int deci){

        int bin=0;
        int place=1;

        while(deci!=0){
            int rem= deci%2;
            deci=deci/2;

            bin=bin+rem*place;
            place=place*10;
        }
        return bin;
    }

    public static int decitoany(int deci,int base){

        int any=0;
        int place=1;

        while(deci!=0){
            int rem= deci%base;
            deci=deci/base;

            any=any+rem*place;
            place=place*10;
        }
        return any;
    }

    public static int bintodeci(int bin){

        int deci=0;
        int place=1;

        while(bin!=0){
            int rem= bin%10;
            bin=bin/10;

            deci=deci+rem*place;
            place=place*2;
        }
        return deci;
    }

    public static int anytodeci(int any,int base){

        int deci=0;
        int place=1;

        while(any!=0){
            int rem= any%10;
            any=any/10;

            deci=deci+rem*place;
            place=place*base;
        }
        return deci;
    }

    public static int anytoany(int any,int fbase, int sbase){

        int deci =anytodeci(any,fbase);

       return decitoany(deci,sbase);
    }
}
