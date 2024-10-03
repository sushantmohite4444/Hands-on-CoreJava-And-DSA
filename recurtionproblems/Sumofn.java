package recursion;



public class Sumofn {
	
	static int sum=0;
	public static int  sum(int n) {
		
		if(n==1) {
			return 1;
		}
		
		
		sum = n+sum(n-1);
		System.out.println(n);
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(sum(5));
	}

}
