package com.example.arrayprob.com.example.arraymedian;

import java.util.Arrays;

public class ArrayMedian {
    public static double arrMedian( int arr[ ] ){
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2 != 0){
            return (double) arr[n/2];
        } else {
            return (double) ((arr[(n-1)/2] + arr[n/2])/2.0);
        }
    }
    public static void main(String[] args) {
        int arr[ ] = {2,4,1,3,5};
        double ans = arrMedian(arr);
        System.out.println(ans);
    }
}
