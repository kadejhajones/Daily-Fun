// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

import java.util.*;

// this approach is good but we need to change 
// class Solution {
//     public int mySqrt(int x) {
//         for(int current = 0; current<=x; current++) {
//             if (current*current > x){
//                 return current-1;
//             }else if (x == (current * current)){
//                 return current;
//             }
//         }
//         return 42;
//     }
// }

class Solution{
    public int mySqrt(int x) {
        int lowBound = 1;
        int highBound = x;
        int midPoint = 1;

        while (lowBound <= highBound){
            midPoint = lowBound + (highBound-lowBound)/2;
            if(midPoint > x / midPoint){
                highBound = midPoint;
            }else if(midPoint <= x / midPoint && (midPoint+1) >  /(midPoint+1)){
                return midPoint;
            }else{
                lowBound = midPoint + 1;
            }
        }
        return lowBound;
    }
}
