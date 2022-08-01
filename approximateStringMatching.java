
public class approximateStringMatching {
	public static int wt(int m,int n,int o ) {
		if(m<=n && m<=o) {
			return m;
		}else if(n<=m && n<=o) {
			return n;
		}else {
			return o;
		}
	}

	public static int minEditDistance(String s1,String s2,int x,int y) {
		int dp[][]=new int[x+1][y+1];
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=y;j++) {
				if(i==0) {
					dp[i][j]=j;
				}else if(j==0) {
					dp[i][j]=i;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}else {
					dp[i][j]=1+wt(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
				}
			}
			
		}
		return dp[x][y];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aba";
		String s2="bab";
		System.out.println("MINIMUM EDIT DISTANCE "+minEditDistance(s1,s2,s1.length(),s2.length()));

	}

}
