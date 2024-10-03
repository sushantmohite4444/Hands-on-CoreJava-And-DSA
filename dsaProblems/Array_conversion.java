package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_conversion {
	public static void main(String[] args) {
	
		String arr[] = {"Sushant","Vikas","mohite"};
		System.out.println(arr[1]);
		
		int arr1[] []= new int[3][7]; 
		
		System.out.println(arr1.length);
		System.out.println(arr1[2].length);
		
		List al;
		
		al= Arrays.asList(arr);
		al.set(2, "Mohite");
		//al.set(1, 10);
		System.out.println(al);
	}

}
