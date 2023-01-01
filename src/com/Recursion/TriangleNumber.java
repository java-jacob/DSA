package com.Recursion;

public class TriangleNumber {
    public static void main(String[] args) {
        int n = 10000;
        System.out.println(normalTriangle(n));
        System.out.println(recursiveTriangle(n));
    }
    public static int normalTriangle(int n){
        int total = 0;
        while(n>0){
            total = total + n;
            --n;
        }
        return total;
    }

    public  static int recursiveTriangle(int n){
        if(n==0 ) return 0;
        return n + recursiveTriangle(n-1);
    }
}
