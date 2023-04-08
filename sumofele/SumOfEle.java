package com.example.arrayprob.com.example.sumofele;

public class SumOfEle {
    public static int sumOfEle( int arr[] ){
        int sum = 0;
        for( int i=0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[ ] = {1,2,3,4,5};
        int ans = sumOfEle(arr);
        System.out.println(ans);
    }
}
