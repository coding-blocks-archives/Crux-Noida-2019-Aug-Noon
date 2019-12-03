package com.company.Lec26;

public class LongestPallinsequence {

    public static void main(String[] args) {
        String s1= "abaab";

        System.out.println(longPallinSeq(s1,0,s1.length()-1));

    }

    public static int longPallinSeq(String line, int start, int end){
        if (start == end){
            return 1;
        }

        if (start > end){
            return 0;
        }

        int res = 0;

        if (line.charAt(start) == line.charAt(end)){
            res = 2 + longPallinSeq(line, start + 1, end - 1);
        } else {
            int left = longPallinSeq(line, start + 1, end);
            int right = longPallinSeq(line, start, end - 1);
            res = Math.max(left, right);
        }

        return res;
    }

}
