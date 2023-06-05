//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
//The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

class Solution {
    public int[] plusOne(int[] digits) {
    
        int [] newRes = new int [digits.length];
        int carry = 1;
        for(int currentPos = digits.length-1; currentPos >= 0; currentPos--){
            int newDigit = digits[currentPos] + carry;
            newRes[currentPos] = newDigit % 10;
            carry = newDigit / 10;
        }
        
        if(carry != 0){
            int[] result = new int [digits.length+1];
            result[0] = 1;
            return result;
        }
        return newRes;
    }
}
