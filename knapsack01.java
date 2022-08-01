
public class knapsack01 {

	public static int knapSack(int W,int wt[], int val[],int n) {
		int K[][]=new int [n+1][W+1];
		
		for(int i=0;i<=n;i++) {
			for(int w=0;w<=W;w++) {
				if(i==0 || w==0) {
					K[i][w]=0;
				}
				else if(wt[i-1]<=w) {
					K[i][w]=(int)Math.max(K[i-1][w], K[i-1][w-wt[i-1]]+val[i-1]);
				}else {
					K[i][w]=K[i-1][w];
				}
			}
		}
		return K[n][W];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[]= {1,3,4,5};
		int val[]= {1,4,5,7};
		int W=7 ;
		int n=val.length;
		System.out.println(knapSack(W,wt,val,n));

	}

}
