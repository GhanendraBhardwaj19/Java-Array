package com.example.arrayprob.com.example;

public class removeDup {
    public static String removeDup( String str ){
        String ans  = "";
        for(int i=0; i<=str.length()-1;i++){
            char curr = str.charAt(i);
            for(int j=0; j<=str.length()-1;j++){
                if(str.charAt(j) == curr){
                    continue;
                }
                else if( i==j){
                    ans+=str.charAt(i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = removeDup("ghanendra");
        System.out.println(s);
    }
}
