package com.example.arrayprob.com.example.addelements;

public class AddElements {
    public static void  printArray( int arr[] ){
        for( int i=0; i<= arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertAtBeginning( int arr[] , int x , int n){
        for (int i=n-1; i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = x;
    }

    public static void insertAtEnd( int arr[] , int x , int n){
        arr[n] = x;
    }
    public static void insertAtPos( int arr[] , int x , int n, int k){
        for (int i = n; i >=k; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[k - 1] = x;

    }
    public static void main(String[] args) {
        int arr[ ] = { 3,4,5,6,3,2,1,4,0};
        int n = 8;
//        insertAtBeginning(arr, 20, n);
//        printArray(arr);
//        insertAtEnd(arr,30 ,n);
//        printArray(arr);
        insertAtPos(arr,40, n,5);
        printArray(arr);
    }
}
