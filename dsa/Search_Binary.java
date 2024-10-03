package dsa;

import java.util.Arrays;

// binary search used only on sorted array  time complexity log(n);

// Example for floor value
import javax.naming.ldap.SortControl;

public class Search_Binary {
	
	static int  SearchUsingBinary(int arr[],int target) {
		int start =0;
		 int end=arr.length-1;
		 while(start<=end) {
				int mid= (start + end)/2;
//				System.out.println(start +" "+ end);
				if(arr[mid]==target) {
					return mid;
				}
				else if (arr[mid]<target) {
					start=mid+1;
				}
				else  {
					end=mid-1;
				}
	}
		 return -1; 
	}
	static int floornum(int arr[],int target) {
		int start =0;
		 int end=arr.length-1;
		 while(start<=end) {
				int mid= (start + end)/2;
//				System.out.println(start +" "+ end);
				if(arr[mid]==target) {
					return mid;
				}
				else if (arr[mid]<target) {
					start=mid+1;
				}
				else  {
					end=mid-1;
				}
	}
		 return end; 
	}
	static int Ceilingnum(int arr[],int target) {
		 
		int start =0;
		int end = arr.length -1;
		while(start<=end) {
			int mid= start + (end-start)/2;
			if(mid==target) {
				return mid;
			}
			else if(target < arr[mid]) {
				end= mid-1;
			}
			else {
				start =mid+1;
			}
		}
		
		return start;
		
	}
	
public static void main(String[] args) {
	int[] arr = {1,4,6,7,12,36,44};
	int target=36;
	 
//	Arrays.sort(arr);
	 
//	for (int i : arr) {System.out.println(i);}

 // Binary Search Example
	
System.out.println(	SearchUsingBinary(arr, target));
	
	
//	floor example
	System.out.println(floornum(arr, target));
	
//  Ceiling	Example
	
	System.out.println(Ceilingnum(arr, target));
	
	 	
	}

}
