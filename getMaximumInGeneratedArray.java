class Solution {
    public int getMaximumGenerated(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int ans[]=new int[n+1];
        ans[0]=0;
        ans[1]=1;
        int m=0;
        for(int i=2;i<=n;i++){
            if(i%2==0) ans[i]=ans[i/2];
            else ans[i]=ans[i/2]+ans[i/2+1];
            m=Math.max(m,ans[i]);

        }
        return m;
    }
}
