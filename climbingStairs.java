class Solution {
    public int climbStairs(int n) {
       if(n <= 2) return n; //if 1 or 2 
        
        int[] ans = new int[n + 1];
        ans[1] = 1;
        ans[2] = 2;
        
        for(int i = 3; i <= n; i++) 
            ans[i] = ans[i - 1] + ans[i - 2];      // it will end up as fibonnaci series
                                                   
        return ans[n];
        
    // TC:- O(n)
    // S.C:- O(n)    
    
    
    }
}
