package dsa;

import java.util.Arrays;

public class Sort_Bubble_Recurtion {
	public static void main(String[] args) {
		
		int[] arr ={1,6,3,4,8};
		bsr(arr,arr.length-1,0);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bsr(int[] arr,int l, int c) {
		
		if(l==0){
			return;
		}
		if(c<l) {
			if(arr[c] > arr[c+1]) {
				int temp =arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			bsr(arr, l, c+1);
			
		}else {
			
			bsr(arr, l-1, 0);
		}
		
	}

}
