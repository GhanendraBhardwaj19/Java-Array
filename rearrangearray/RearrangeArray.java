package com.example.arrayprob.com.example.rearrangearray;

import java.util.Arrays;

public class RearrangeArray {
    public static void rearrangeArray( int arr[ ] ){
        Arrays.sort(arr);
        for(int i=0; i< arr.length/2; i++){
            System.out.print(arr[i] + " ");
        }
        for(int j= arr.length-1; j>=arr.length/2;j--){
            System.out.print(arr[j] + " ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {8 ,7, 1, 6, 5, 9};
        rearrangeArray(arr);
    }
}
