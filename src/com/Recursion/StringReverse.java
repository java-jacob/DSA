package com.Recursion;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reversStringNormal("MAKRI KUTTAN"));
    }


    /**
     * RECURSIVE 1
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        if (str.length() == 1) return str;
        return str.substring(str.length() - 1) + reverseString(str.substring(0,str.length()-1));
    }

    /**
     * RECURSIVE 2
     * @param str
     * @return
     */
    public static String reverseString2(String str) {
        if (str.length() == 1) return str;
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }

    public static String reversStringNormal(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}