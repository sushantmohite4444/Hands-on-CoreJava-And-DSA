package recursion;

public class Fibonacci {
	
	
	public static void ok(int i,int j ,int n) {
	
		if(n==2) {
			
			return ;
		}
		
		int c = i+j;
		System.out.println(c);
		 ok(j,c,n-1);

	}
	
	public static void main(String[] args) {
		
		int n=1;
		if(n==0) {
			System.out.println(0);
			
		}
		
		if(n>=1) {
			System.out.println(0);
			System.out.println(1);
		}
		if(n>=2){
			
			ok(0,1,n);
		}
		
	}

}
