//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        //need to make sure each has one 
        //maybe use a switch case
        return check(s);
    }

    public boolean check(String s){
        //implementation doesn''t work because the parentheses can be in almost any order 
        //not just one right after the other like the examples show 
            // if (count == 0){
            //     return true;
            // }else {
            //     for(int i = 0; i < count; i++){
            //         if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
            //             return true;
            //         }else if(s.charAt(i) == '[' && s.charAt(i+1) == ']'){
            //             return true;
            //         }else if(s.charAt(i) == '{' && s.charAt(i+1) == '}'){
            //             return true;
            //         }
            //         return false;
            //     }
            // }
            // return false;
        
        //lets use a start to put on the front ends of the parentheses and use a case statement 
        int count = s.length();
       //creating a stack to put elements on and off of to check them 
        Stack<Character> stack = new Stack<>(); //sideNote: make sure to say it is a stack of char
        
        if(count != 0){
            for(int i = 0; i < count; i++){
                char current = s.charAt(i);

                switch(current){
                    case '(':
                        stack.push(current);
                        break;
                    case '{':
                        stack.push(current);
                        break;
                    case '[':
                        stack.push(current);
                        break;
                    case ')':
                        //going to peek 
                        //then pop if right
                        if (stack.isEmpty() || stack.peek() != '('){
                            return false;
                        }
                        stack.pop();
                        break;                            
                    case']':
                        //going to peek 
                        //then pop if right
                        if (stack.isEmpty() || stack.peek() != '['){
                            return false;
                        }
                        stack.pop();
                        break;         
                    case '}':
                       //going to peek 
                        //then pop if right
                        if (stack.isEmpty() || stack.peek() != '{'){
                            return false;
                        }
                        stack.pop();
                        break;             
                    default:
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
