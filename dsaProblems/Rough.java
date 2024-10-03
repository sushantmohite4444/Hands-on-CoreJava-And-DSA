package practiceDsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import leadcode.Stringtocan;

public class Rough {

	public static void main(String[] args) {

		int arr[][] ={ {1,2,3},
					  {4,5,6},
					  {7,8,9}};

		fun("",arr, 0,0);
		System.out.println(Arrays.toString(arr));
	}

	private static void fun(String ans,int [][] arr, int row ,int col) {
		
		if(arr.length-1==row && arr[0].length-1==col) {
			System.out.println(ans);
			
			return;
		}
		
		if(arr[row][col]==0) {
			return;
		}
		arr[row][col]=0;
		
		
			if(row<arr.length-1) {
				fun(ans+"D", arr, row+1, col);
			}
			
			if(col<arr[0].length-1) {
				fun(ans+"R", arr, row, col+1);
			}
			if(row>0) {
				fun(ans+"U", arr, row-1, col);
			}
			if(col>0) {
				fun(ans+"L", arr, row, col-1);
			}
			
			arr[row][col]=1;
		}
	}

