//TC:- O(n)
//SC:- O(1)
public class btbss1 {
	// BEST TIME TO BUY AND SELL STOCK PART 1

	public static void main(String[] args) {
		// LEETCODE 121
		
		int a[] ={3,5,1,7,4,9,3};
		
		int maxProfit=0;
		int minSoFar=a[0];
		for(int i =0; i<a.length;i++) {
			minSoFar= Math.min(minSoFar, a[i]);
			int p=a[i]-minSoFar;
			maxProfit=Math.max(maxProfit, p);
		}
		
		System.out.println(maxProfit);
		

	}

}
