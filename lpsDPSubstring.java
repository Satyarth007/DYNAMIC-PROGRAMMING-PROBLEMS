// this will give the actual substring which is lobgest palindromic in nature:_
public class lpsDPSubstring {
	public static String lps(String s) {
		String ans="";
		int anslen=0;
		
		for(int i=0;i<s.length();i++) {
			// ODD LENGTH SUBSTRING
			int ol=i, or=i;
			while(ol>=0 && or < s.length() && s.charAt(ol)==s.charAt(or)) {
				if((or-ol+1) > anslen) {
					ans=s.substring(ol,or+1);
					anslen= or - ol +1;
				}
				
				ol--;
				or++;
			}
			
			// EVEN LENGTH SUBSTRING
						int el=i, er=i+1;
						while(el>=0 && er < s.length() && s.charAt(el)==s.charAt(er)) {
							if((er-el+1) > anslen) {
								ans=s.substring(el,er+1);
								anslen= er - el +1;
							}
							
							el--;
							er++;
						}
		}
		
		return ans;
	}
	

	public static void main(String[] args) {
		
		String s="abccbc";
		
		System.out.println("LONGEST PALINDROMIC SUBSTRING IS :- "+lps(s));
		
		
		

	}

}
