//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

class Solution {
    public int climbStairs(int n) {
        //one or two steps at a time 
        //2 approaches 
            //recusrive approach from end to the begining 
            //(only way to get to the 4th step is from the 3rd step only way to get to the 3rd step..)

        //if step = 1 only one way = 1 step       
        if (n == 1){
            return 1;
        }

        //if step = 2, 2 ways, one step + one step, or just take 2 steps
        if(n == 2){
            return 2;
        }

        int [] data = new int[n];  
        data[0]=1;
        data[1]=2;    

        
        //need to loop through 
        for(int i = 2; i < n; i++){
            //now they can either take different amounts of steps 
            data[i] = data[i-1]+data[i-2];
        }
        return data[n-1];
    }
}
