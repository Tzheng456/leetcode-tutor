package StacksAndQueues;

import java.util.Stack;
import java.util.*;
public class BalancedParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<String> charStack = new Stack<>();
        Map<String, String> openBrackets = new HashMap<>();
        openBrackets.put(")", "(");
        openBrackets.put("]", "[");
        openBrackets.put("}", "{");
        for(int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i+1);
            if (openBrackets.containsValue(current)) {
                charStack.push(current);
            } else if (!charStack.isEmpty()) {
                if (openBrackets.get(current).equals(charStack.peek())) {
                    charStack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return charStack.isEmpty();
    }

    public static void main(String[] args) {
        String a = "(()())";
        String b = "(()";
        String c = "{([])}";
        String d = "(){";
        String e = "()[]";

        System.out.println("expect true: " + isValid(a));
        System.out.println("expect false: " + isValid(b));
        System.out.println("expect true: " + isValid(c));
        System.out.println("expect false: " + isValid(d));
        System.out.println("expect true: " + isValid(e));
    }
}
