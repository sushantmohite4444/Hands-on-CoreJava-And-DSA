package dsa;

import java.util.Arrays;

public class Merge_Sort_Without_Creation_New_Array {
	
	public  static void msort(int arr[],int s ,int e) {
		if(s >=e) {
			return;
		}
		
		int mid= (s+e) /2;
		
		msort(arr, s, mid);
		msort(arr, mid+1, e);
		
		System.out.println(s + " " +mid + " "+ e);
		 msortcomp(arr ,s ,mid,e);
		
		
	}
	
	
	private static void msortcomp(int[] arr, int s, int mid, int e) {
		
         int Newarr[]=new  int[e-s+1];
		
		int i=s;
		int j=mid+1;
		int k=0;
		
		while(i<= mid && j<= e) {
			if(arr[i] <= arr[j]) {
				Newarr[k] = arr[i];
				i++;
			}
			else {
				Newarr[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			Newarr[k]=arr[i];
			i++;
			k++;
		}
		while(j<=e) {
			Newarr[k]=arr[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(Newarr));
		
		for (int k2 = 0; k2 < Newarr.length; k2++) {
			arr[s+ k2]=Newarr[k2];
		}

		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,5,3,8,4,9,6,7,2};
		
	msort(arr, 0, arr.length-1);
		
	System.out.println(Arrays.toString(arr));
	System.out.println(0/2);
		
	}

}
