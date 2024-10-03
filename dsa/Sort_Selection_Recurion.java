package dsa;

import java.util.Arrays;

public class Sort_Selection_Recurion {
	public static void main(String[] args) {
		
		int[] arr= {3,4,2,7,4};
		Sortselectionrec(arr, arr.length-1, 0, 0);
		System.out.print(Arrays.toString(arr));
	}
		
	public static void Sortselectionrec(int arr[],int r,int c,int max) {
		
		if(r==0) {
			return;
		}
		if(c <=r) {
			if( arr[c] > arr[max]) {
				max=c;
			}
			
			Sortselectionrec(arr, r, c+1, max);
		}
		else {
			int temp = arr[max];
			arr[max]=arr[r];
			arr[r]=temp;
			
			Sortselectionrec(arr, r-1, 0, 0);
			
		}
	}
}
