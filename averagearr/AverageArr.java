package com.example.arrayprob.come.example.averagearr;

public class AverageArr {
    public static int sumOfEle( int arr[] ){
        int sum = 0;
        for( int i=0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void avgArr( int arr[] ){
        int den = arr.length -1;
        int sum = sumOfEle(arr);
        int avg = sum/den;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int arr[ ] = {1,2,1,1,5,1};
        avgArr(arr);
    }
}
