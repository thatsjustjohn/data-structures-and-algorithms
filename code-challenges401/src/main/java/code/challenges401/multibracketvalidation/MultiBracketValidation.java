package code.challenges401.multibracketvalidation;

import code.challenges401.stacksandqueues.Stack;

import java.util.*;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        if(input == null) throw new IllegalArgumentException();
        Map<Character, Character> bracketMap = new HashMap<Character, Character>() {{
            put('{', '}');
            put('(', ')');
            put('[', ']');

        }};
        Stack<Character> bracketStack = new Stack();
        for(int i = 0; i < input.length(); i++){
            if(bracketMap.containsKey(input.charAt(i))){
                bracketStack.push(input.charAt(i));
                continue;
            }
            if(bracketMap.containsValue(input.charAt(i))){
                if(bracketStack.isEmpty()) return false;
                if(bracketMap.get(bracketStack.pop()) != input.charAt(i)){
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }
}
