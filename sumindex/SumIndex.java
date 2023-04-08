package com.example.arrayprob.com.example.sumindex;

public class SumIndex {
    public static int sumIndex( int arr[] ){
        int leftSum,rightSum;
        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            rightSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2,3,-1,8,4 };
        int ans = sumIndex(arr);
        System.out.println(ans);
    }
}
