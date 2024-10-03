package dsaProblems;

public class MazeAllPossibleProb {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][3];
		int path[][]=new int [3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=1;
			}
			
		}
//		updownrightleft("",arr,0,0);
		updownrightleftmatrix("", arr,0,0,path,1);
	}
	
	

	private static void updownrightleftmatrix(String p,int[][] arr,int i, int j,int [][]path,int val) {
		
		if(i==arr.length-1 && j==arr[0].length-1) {
			path[i][j]=val;
			for (int k = 0; k < path.length; k++) {
				for (int k2 = 0; k2 < path.length; k2++) {
					System.out.print(path[k][k2] + " ");
				}
				System.out.println();
			}
			
			System.out.println(p);
			System.out.println();
			return;
				
		}
		if(arr[i][j]==0) {
			return;
		}
		arr[i][j]=0;
		path[i][j]=val;
		
		if(i<arr.length-1) {
			updownrightleftmatrix(p +"R", arr, i+1, j ,path,val+1);
		}
		if(j<arr[0].length-1) {
			updownrightleftmatrix(p +"D", arr, i, j+1,path,val+1);
		}
		if(j>0) {
			updownrightleftmatrix(p + "U", arr, i, j-1,path,val+1);
		}
		if(i>0) {
			updownrightleftmatrix(p + "L", arr, i-1, j,path,val+1);
		}
		
		arr[i][j]=1;
		path[i][j]=0;
		
	}
	
	
private static void updownrightleft(String p,int[][] arr, int i, int j) {
		
		if(i==arr.length-1 && j==arr[0].length-1) {
			System.out.println(p);
			return;
		}
		if(arr[i][j] == 0) {
			return;
		}
		arr[i][j]=0;
		
		if(i<arr.length-1) {
			updownrightleft(p +"R", arr, i+1, j);
		}
		if(j<arr[0].length-1) {
			updownrightleft(p +"D", arr, i, j+1);
		}
		if(j>0) {
			updownrightleft(p + "U", arr, i, j-1);
		}
		if(i>0) {
			updownrightleft(p + "L", arr, i-1, j);
		}
		arr[i][j]=1;
	}

}
