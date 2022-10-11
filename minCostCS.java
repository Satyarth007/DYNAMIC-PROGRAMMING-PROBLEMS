// DP APPROACH LEETCODE 746

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int helper[]=new int[n+1];
        
        // for index 0 
        helper[n]=0;
        helper[n-1]=cost[n-1];
        for(int i=n-2;i>=0;i--){
            int x=helper[i+1];
            int y=helper[i+2];
            helper[i]=Math.min(x,y)+cost[i];
        }
        int a=helper[0];
        
        // for  index 1 
        helper[n]=0;
        helper[n-1]=cost[n-1];
        for(int i=n-2;i>0;i--){
            int x=helper[i+1];
            int y=helper[i+2];
            helper[i]=Math.min(x,y)+cost[i];
        }
        int b=helper[1];
        
        return Math.min(a,b);
                        
    
    }
}
