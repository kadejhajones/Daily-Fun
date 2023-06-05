//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {
        //use the contains method 
        boolean isContained = haystack.contains(needle);
        
        //if it is in there then find it 
        if(isContained){
            //return the location where it is
            //need to find the location aka use the indexOf methods? 
            int location = haystack.indexOf(needle);
            return location;
        }
        return -1;
    }
}
