package com.StackAndQueue;

/**
 * PUSH CHAR INTO STACK
 * MATCH CLOSE STACK ELSE ERROR
 * STILL REMAINING ITEMS IN STACK - ERROR
 */
public class DelimiterCheckerWithStack {
    public static void main(String[] args) {
        System.out.println(checkDelimiter("({[]})"));
        System.out.println(checkDelimiter("[]]()()"));
    }
    public static boolean checkDelimiter(String str){
        CharStack charStack = new CharStack(str.length());
        for(int i=0;i < str.length(); i++){
            char c = str.charAt(i);
            switch (c){
                case '(':
                case'{':
                case '[':
                    charStack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if(charStack.isEmpty()) {
                        System.out.println("Illegal char:"+c +" at position:"+i);
                        return  false;
                    } else {
                        char popc = charStack.pop();
                        if(popc == '(' && c!= ')' || popc == '[' && c!= ']' || popc == '{' && c!= '}'){
                            System.out.println("Illegal char:"+c +" at position:"+i);
                            return false;
                        }
                    }
                break;
            }
        }
        if(!charStack.isEmpty()){
            System.out.println("No matching right bracket:"+charStack.pop());
            return  false;
        }
        return true;
    }
}
