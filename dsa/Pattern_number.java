package dsa;

public class Pattern_number {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 1; i <= 2*n; i++) {
			
			
			int colforrow = i>n?2*n-i:i;
			
			
			for (int j = 0; j < n-colforrow ; j++) {
				System.out.print("  ");
			}
			
			for (int j = colforrow; j > 0; j--) {
				System.out.print(j+" ");
			}
			for (int j = 2; j <= colforrow; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}

}
