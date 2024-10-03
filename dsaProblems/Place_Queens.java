package dsaProblems;

import java.util.Arrays;

public class Place_Queens {

	public static void main(String[] args) {
		
		int n=5, m=5;
		boolean mahel[][]=new boolean[n][m]; 
		
		System.out.println(placequeens(mahel,0,0));

	}

	private static int placequeens(boolean[][] mahel, int row,int coll) {
		
		if(coll== mahel[0].length)
			return 0;
		
		if(row == mahel.length) {
			
			DisplayQueenplace(mahel);
			System.out.println();
			return 1;
		}
	 int count =0;
		
		for (int col = 0; col < mahel.length; col++) {
			
			if(safe( mahel,row,col)) {
				mahel[row][col]=true;
				count += placequeens(mahel, row+1,coll);
				mahel[row][col]=false;
			}
			}
			
		return count;
		}
		
	

	

	private static boolean safe(boolean mahel[][],int row, int col) {
		
		for (int i = 0 ; i <row ; i++) {
			if(mahel[i][col]) {
			return false;
			}
		}
		
		for (int i = 0; i <= Math.min(row, col); i++) {
			
			if(mahel[row-i][col-i]) {
				return false;
			}
			
			for (int j = 0; j <= Math.min(row, mahel .length-col-1); j++) {
				if(mahel[row-j][col+j]) {
					return false;
				}
			}
			
		}
		return true;
	}
	private static void DisplayQueenplace(boolean[][] mahel) {

           for (boolean[] bs : mahel) {
			for (boolean bs2 : bs) {
				if(bs2) 
					System.out.print("Q" + " ");
				else System.out.print("K" + " ");
			}
			System.out.println();
		}
		
	}

	

}
