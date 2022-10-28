
public class btbss2 {
	// BEST TIME TO BUY AND SELL STOCK

	public static void main(String[] args) {
		// LEETCODE 122
		
				int a[] ={5,2,7,3,6,1,2,4};
				
				int p=0;
				for(int i =1; i<a.length;i++) {
					if(a[i]>a[i-1]) {
						p+= (a[i]-a[i-1]);
					}
					
				}
				
				System.out.println(p);

	}

}
