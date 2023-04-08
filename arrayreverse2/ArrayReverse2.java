package com.example.arrayprob.com.example.arrayreverse2;

public class ArrayReverse2 {
    public static void printArray ( int arr[] ){
        for (int i = 0; i<= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray( int arr[] ){
        int n = arr.length;
        for (int i=0; i< arr.length/2; i++) {
            int temp = arr[n - 1 -i ];
            arr[n - 1 - i] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        reverseArray(arr);
    }
}
