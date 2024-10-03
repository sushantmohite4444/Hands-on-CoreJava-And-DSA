package practiceDsa;

public class PattenPrint {
	public static void main(String[] args) {
		
		int n=5;
		for (int i = 1; i <2*n; i++) {
			
			int col= i>n ? 2*n-i:i;
			
			
			
			for (int j = 0; j <n-col; j++) {
				System.out.print("  ");
			}
			if(i>n) {
				for (int j = 0; j <2*n+4; j++) {
					System.out.print(" ");
				}
			
			}
			for (int j = col; j > 0; j--) {
				System.out.print(j + " ");
			}
		
			for (int j = 2; j < col+1 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
