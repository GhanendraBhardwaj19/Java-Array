package com.example.arrayprob.com.example.searchele;

public class SearchEle {
    public static int searchEle( int arr[], int x){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans = searchEle(arr,3);
        System.out.println(ans);
    }
}
