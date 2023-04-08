package com.example.arrayprob.com.example.largestnum;

public class LargestNum {
    public static int largestNum( int arr[] ){
        int largest = Integer.MIN_VALUE;
        for( int i = 0; i<=arr.length-1; i++){
            if( largest < arr[i] ){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
//        We can sort the array then number on last index will be smallest number..!
        int arr[] = { 2, 5, 6, 7, 1, 8};
        System.out.println(largestNum(arr));
    }
}
