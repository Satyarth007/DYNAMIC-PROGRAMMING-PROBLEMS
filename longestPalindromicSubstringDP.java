// THIS CODE GENERATES THE LENGTH ONLY:- 
public class longestPalindromicSubstringDP {

	public static void main(String[] args) {
		String s="abccbc";
		String ans="";
	
	    boolean[][] dp=new boolean[s.length()][s.length()];
	    int len=0;
		        
        for(int gap=0;gap<s.length();gap++){
	         for(int i=0,j=gap;j<dp.length;i++,j++){
		            if(gap==0){
		               dp[i][j]=true;
		               ans+=s.charAt(gap);
		            }else if(gap==1){
		                dp[i][j]= (s.charAt(i)==s.charAt(j));
		                ans+=s.charAt(gap);
		            }else{
		                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
		                      dp[i][j]=true;
		                      ans+=s.charAt(gap);
		                      
		                  }else{
		                      dp[i][j]=false;
		                  }
		             }
		                
		              if(dp[i][j]){
		                    len=gap+1;
		              }
		            }
		        }
        System.out.println("LONGEST SUBSTRING LENGTH IS :- "+len);
		      
		    
		}

	}


