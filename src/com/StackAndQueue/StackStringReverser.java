package com.StackAndQueue;

public class StackStringReverser {
    public static void main(String[] args) {
        System.out.println(stringReverse("JACOB"));
        System.out.println(stringReverse("MALAYALAM"));
    }

    /**
     * String reversal using STACK
     * @param str
     * @return
     */
    public static String stringReverse(String str){
        CharStack charStack = new CharStack(str.length());
        for(int i =0 ; i < str.length(); i ++){
            charStack.push(str.charAt(i));
        }
        String out = "";
        while(!charStack.isEmpty()){
            out = out + charStack.pop();
        }
        return out;
    }
}
