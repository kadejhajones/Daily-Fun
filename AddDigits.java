//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
class Solution {
    public int addDigits(int num) {
        //want to break up each the numbers and then add them each individually 

        if(num == 0){
            return 0;
        }

       if (num % 9 == 0){
           return 9;
       }
       
        return num % 9;
    }
}
