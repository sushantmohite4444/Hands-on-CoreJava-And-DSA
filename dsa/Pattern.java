package dsa;

import java.util.Arrays;

public class Pattern {
   public static void main(String[] args) {
	
	   int n=4;	 
	   
	   for (int i = 0; i <= 2*n; i++) 
	   {
		   int  ColinRow = i>n ?2*n-i: i; 
		   
		   int spaces = n- ColinRow;
		   
		   for (int j = 0; j < spaces; j++) {
			System.out.print(" ");
		}
		   
		   for (int j = 0; j <= ColinRow; j++) {
			System.out.print("* ");
		      }
		   System.out.println();
	}
	   
}

}
