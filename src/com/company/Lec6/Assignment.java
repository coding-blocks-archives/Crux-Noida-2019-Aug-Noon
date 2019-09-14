package com.company.Lec6;

public class Assignment {

    public static void main(String[] args) {
        int precision=4;
        int n=10;
        float ans=sqrt(n);

        float f=0.1f;

        for (int i = 0; i <precision ; i++) {

            while(ans*ans<=n){
                ans=ans+f;
            }
            ans=ans-f;
            f=f/10;
        }
        System.out.println(ans);
        System.out.printf("%."+precision+"f",ans);
    }

    public static int sqrt(int n){

        int ans=0;
        int start=0;
        int end=n;

        while(start<=end){

            int mid=(start+end)/2;

            if(mid*mid==n){
                return mid;
            }

            else if(mid*mid<n){
                ans=mid;
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
