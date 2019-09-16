package com.company.Lect7;

public class TwoDarrayeg {

    public static void main(String[] args) {
        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};

        spiral(ar);
    }

    public static void spiral(int ar[][]){

        int top=0;
        int left=0;
        int bottom=ar.length-1;
        int right= ar[0].length-1;

        while(top<=bottom &&left<=right){

            for (int i = left; i <=right ; i++) {
                System.out.println(ar[top][i]);
            }
            top++;

            for (int i =top; i <=bottom ; i++) {
                System.out.println(ar[i][right]);
            }
            right--;

            for (int i = right; i >=left ; i--) {
                System.out.println(ar[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >=top ; i--) {
                System.out.println(ar[i][left]);
            }
            left++;
        }
    }
}
