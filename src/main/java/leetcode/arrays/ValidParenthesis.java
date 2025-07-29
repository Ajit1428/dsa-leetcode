package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isParenthesisValid(String s){
        Stack<Character> pStack = new Stack<>();
        Map<Character, Character> pMap = new HashMap<>();
        pMap.put('}', '{');
        pMap.put(')', '(');
        pMap.put(']', '[');

        for(char str: s.toCharArray()){
            if(pMap.containsValue(str)){
                pStack.push(str);
            }else if(pMap.containsKey(str)){
                if(pStack.isEmpty() || pMap.get(str) != pStack.pop()){
                    return false;
                }
            }
        }

        System.out.println(pStack);

        return pStack.isEmpty();
    }
}
