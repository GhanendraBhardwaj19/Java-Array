package com.example.arrayprob.com.example.issubarr;

public class IsSubArr {
    public static boolean isSubArr( int arr1[] , int arr2[] ){
        if(arr1.length> arr2.length){
            return false;
        }
        for( int i=0; i<= arr1.length-1; i++){
            boolean present = true;
            for(int j=0; i<= arr2.length-1; j++){
                if(arr1[i] != arr2[j]) {
                    present = true;
                    break;
                }
            }
            if(present == false) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5,2};
        int arr2[] = {2,4,3,1,7,5,15};
        boolean ans = isSubArr(arr1,arr2);
        System.out.println(ans);
    }
}
