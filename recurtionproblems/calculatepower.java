package recursion;

public class calculatepower {
	
	static int power;
	public static int  power(int n,int i) {
		if(i==1 ) {
			return n;
		}
		power = n*power(n ,i-1);
		
		
		return power;
		
	}
	
	public static void main(String[] args) {
		System.out.println(power(4,9));
		
	System.out.println(Math.pow(4, 9));
		
	}

}
