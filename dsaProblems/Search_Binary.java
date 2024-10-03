package practiceDsa;

public class Search_Binary {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 46, 55, 65, 67, 76, 99 };
		int target=65;

		int c = midsearch(a,target);
		System.out.println(c);
	}

	public static int midsearch(int[] arr,int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			
			if(arr[mid]>target) {
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}

		}
		return -1;
		

	}

}
