package recursion;

public class Factiorial {
	
	static int fact;
	public static int facto(int n) {
		
		if(n==1) {
			return 1;
		}
		
		fact = n*facto(n-1);
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		System.out.println(facto(5));
	}

}
