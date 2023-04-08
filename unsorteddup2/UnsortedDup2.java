package com.example.arrayprob.com.example.unsorteddup2;

import java.util.HashMap;

public class UnsortedDup2 {
    public static void  unsortedDup( int arr[] ){
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i=0; i<= arr.length-1; i++){
            if(!map.containsKey(arr[i])){
                System.out.print(arr[i] + " ");
                map.put(arr[i], 1 );
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,9,3,1,3,9};
        unsortedDup(arr);
    }
}
