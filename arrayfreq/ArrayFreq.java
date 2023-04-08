package com.example.arrayprob.com.example.arrayfreq;

public class ArrayFreq {
    public static void countFreq( int arr[] ){
        int current;
        for( int i=0; i< arr.length-1; i++){
            if(arr[i] < 0){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<= arr.length-1; j++){

                if(arr[j]<0){
                    continue;
                }
                current = arr[i];
                if(current == arr[j]){
                    arr[j] = -1;
                    count++;
                }

            }
            System.out.println( arr[i] +" "+ count);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,2};
        countFreq(arr);
    }
}
