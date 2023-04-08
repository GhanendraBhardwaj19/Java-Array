package com.example.arrayprob.com.example.arrayreverse;

public class ArrayReverse {
    public static void printArray ( int arr[] ){
        for (int i = 0; i<= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArray( int arr[]){
        int l = 0;
        int r = arr.length - 1;
        while (l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        reverseArray(arr);
    }
}
