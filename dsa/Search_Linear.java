package dsa;

public class Search_Linear {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,3,56,7,42,2};
		
		// In Linear Search = cheak list from  left hand side one by one
		// Best case = Element at first index  , time for best case is constant B(n)=O(1);
		// Worst case = Element at last index ,  time for worst case is n   w(n)=O(n);
		// Average case = all possible case/no.of case  A(n)=n+1/2;
		
		for(int i=0;i<arr.length;i++) {
			if(4==arr[i]) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
