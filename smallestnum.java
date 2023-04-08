package com.example.arrayprob.com.example;

public class smallestnum {
    public static int smallestNum( int arr[] ){
        int smallest = Integer.MAX_VALUE;
        for( int i = 0; i<=arr.length-1; i++){
            if( smallest > arr[i] ){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
//        We can sort the array then number on first index will be smallest number..!
        int arr[] = { 2, 5, 6, 7, 1, 8};
        System.out.println(smallestNum(arr));
    }
}
