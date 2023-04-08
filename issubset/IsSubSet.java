package com.example.arrayprob.com.example.issubset;

import java.util.Arrays;

public class IsSubSet {
    static boolean bSearch(int elem, int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem)
                return true;
            else if (arr[mid] < elem)
                start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    static boolean isSubSet( int arr1[], int arr2[] ){
        if(arr1.length>arr2.length){
            return false;
        }
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length-1; i++){
            boolean present = bSearch(arr1[i],arr2,arr2.length);
            if(present == false) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5,2};
        int arr2[] = {2,4,3,1,7,5,15};
        boolean ans = isSubSet(arr1,arr2);
        System.out.println(ans);
    }
}
