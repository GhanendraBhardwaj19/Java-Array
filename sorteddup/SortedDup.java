package com.example.arrayprob.com.example.sorteddup;

import java.util.HashSet;

public class SortedDup {
    public static void printArray( int arr[] , int n ){
       for (int i=0; i<= n-1; i++){
           System.out.print(arr[i]);
       }
    }
    public static int  sortedDup( int arr[] ){
        HashSet<Integer> set = new HashSet<>();
        for ( int i=0; i<= arr.length-1; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for( int x: set){
            arr[j++] = x;
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = { 1,1,1,2,2,3,3,3,3,4,4};
        int n = sortedDup(arr);
        printArray(arr,n);
    }
}
