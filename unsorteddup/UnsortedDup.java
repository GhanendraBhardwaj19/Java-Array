package com.example.arrayprob.com.example.unsorteddup;

public class UnsortedDup {
    public static void unsortedDup( int arr[] , int n){
        int temp[] = new int [n];
        for (int i = 0; i < n; i++) {
            temp[i] = 1;
        }

        for(int i=0; i<n; i++){
            if(temp[i] == 1){
                for( int j = i+1; j<n; j++){
                    if(arr[i] == arr[j]){
                        temp[j] = 0;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            if(temp[i] == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,9,3,1,3,9};
        unsortedDup(arr, 6);
    }
}
