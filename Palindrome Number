//Given an integer x, return true if x is a 

class Solution {
    public boolean isPalindrome(int x) {

        //if nothing is there or there is only one element return false
        // if(0 >= x <=99){
        //     return false;
        // }

        //breaking up the int into strings 
        String string  = String.valueOf(x);
        int r0 = 0;
        int r1 = string.length()-1;

        while(r0 <= r1){
            if(string.charAt(r0) != string.charAt(r1)){
               return false;
            }
            r0 = r0 + 1;
            r1 = r1 - 1;
        }
        return true;
    }
}
