//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //finding the length of the shortest word
        int shortest = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            shortest = Math.min(shortest, strs[i].length());
        }

        int longestMatch = 0;
        for(int j = 0; j < shortest; j++){
            boolean allMatch = true;
            for(int i = 0; i < strs.length-1; i++){
                if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                    allMatch = false;
                    break;  
                }
            }
            if(allMatch){
                longestMatch++;
            }else{
                break;
            }
        }
        return strs[0].substring(0, longestMatch);
    }
}
