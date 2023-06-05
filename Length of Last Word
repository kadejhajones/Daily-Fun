//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

class Solution {
    public int lengthOfLastWord(String s) {
        //some how I need to figure out how to separate them 
        int count = 0; 
        int length = s.length(); 
        int last = s.length()-1;

//Approach one only works part of the time 
        //because we want the last word lets loop backwards and stop at a ' '
        //java.lang.StringIndexOutOfBoundsException: String index out of range: 11 needed to do length-1
        // for(int i = length-1; i >= 0; i--){
        //     //if the last spot is ' ' then continue one with everything 
        //     if(s.charAt(last) == ' '){
        //         //want to skip the last spot 
        //     }
        //     //this is a great option however bad problem if there is a ' ' before the last word sooooo
        //     if(s.charAt(i) != ' '){
        //         count = count+1;
        //     }else{
        //         return count;
        //     }
        // }
        // return count;

//approach 2 using split 
    //needing to create an array to put it the words into 
    String [] array = new String [1000000];
    array = s.split(" ");

    //make the length of the array the last one and use the length
    count = array[array.length-1].length();

    //returning an int about the length 
    return count;

    }
}
