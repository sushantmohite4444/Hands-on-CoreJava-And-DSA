package practiceDsa;

public class BitwiseOperater_singleNo_in_Group {

	public static void main(String[] args) {
		
		int arr[]= {1,1,1,7,4,3,3,4,4,3,5,5,5};
		int ans=0;
		for (int i : arr) {
			ans +=i;
		}
		
		System.out.println(ans%3);
		
		

	}

}
