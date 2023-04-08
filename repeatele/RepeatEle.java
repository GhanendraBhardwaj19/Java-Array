package com.example.arrayprob.com.example.repeatele;

import java.util.HashMap;
import java.util.Map;

public class RepeatEle {
    public static void repeatEle( int arr[] ){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<= arr.length-1; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1 );
            } else {
                map.put(arr[i], map.get(arr[i])+1 );
            }
        }
        for (Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey() + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,2};
        repeatEle(arr);
    }
}
