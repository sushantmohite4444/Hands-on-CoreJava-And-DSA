package dsa;

import java.util.Arrays;

public class Quick_Sort {
	public static void main(String[] args) {
	
		int arr[]= {1,5,3,7,2,8,9};
		
		Qsort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

 static void Qsort(int[] arr, int low, int high) {
		
		if(low < high) {
			
			int pind=PossitionOfPivot(arr,low,high);
			
			Qsort(arr, low, pind-1);
			Qsort(arr,pind+1,high);
		}
	}

 static int PossitionOfPivot(int[] arr, int low, int high) {
		
	 			int pivot= arr[high];
	 			int j=low-1;
	 			for (int i =low; i < high; i++) {
					if(arr[i]<pivot) {
						j++;
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
	 			j++;
	 			System.out.println(j);
	 			int temp=arr[high];
				arr[high]=arr[j];
				arr[j]=temp;
	 
		return j;
	}

	

}
