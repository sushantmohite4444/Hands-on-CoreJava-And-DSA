package dsaProblems;

public class No_Of_Zeros {
	public static void main(String[] args) {
		int n=10309090;
		int ans=0;
		System.out.println(noz(n, ans));
	}
	
	public static int noz(int n,int ans) {
		
		if(n== 0) {
			return ans;
		}
		
		if(n% 10 == 0) {
			ans= ans+1;

		}
		 n=n/10;
		
		 
		return noz(n, ans);
	}

}
