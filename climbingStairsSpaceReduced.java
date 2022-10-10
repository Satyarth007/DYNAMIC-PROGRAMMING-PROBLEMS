class Solution {
    public int climbStairs(int n) {
      
      // IT IS BASICALLY FIBONNACI SERIES BUT FOR THAT WE DON'T NEED TO CREATE AN ARRAY
      
        int a=1;   // FIRST  VAR
        int b=1;   // SECOND VAR
        
        for(int i=0;i<n-1;i++){     // N th fib will get by n-2 iteration 
            int temp=a;   // storing first var to use it again
            a=a+b;        // getting the next fib no. no.
            b=temp;       // making b as a 
        }
        return a;         // return the nth fib no.
        
    }
}


//TC:- O(N)
//SC:- O(1)
