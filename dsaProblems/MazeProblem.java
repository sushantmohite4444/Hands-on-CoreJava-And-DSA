package dsaProblems;

public class MazeProblem {
	public static void main(String[] args) {
//		System.out.println(downright(3,3));
//		paths("",3,3);
		
		System.out.println(downrightdigonly("",3,3));
		
	}

	private static int  downrightdigonly(String string, int i, int j) {
		
		if(i==1 && j==1 ) {
			System.out.println(string);
			return 1;
		}
		int o = 0,p = 0,q = 0;
		if(i>1&& j>1) {
			  o=downrightdigonly(string+"D", i-1, j-1);
		}
		if(i>1) {
			 p= downrightdigonly(string + "V", i-1, j);
		}
		if(j>1) {
			 q=downrightdigonly(string+ "H", i, j-1);
		}
		return o+p+q;
		
		
	}

	private static void paths(String s,int i, int j) {
		if(i==1 && j==1) {
			System.out.println(s);
			return;
		}
		if(i>1) {
		paths(s+"D",i-1, j);
		}
		if(j>1) {
			
			paths(s+"R",i, j-1);
		}
		
		
		
	}

	private static int downright(int i, int j) {
		
		if(i==1 || j==1) {
		
			return 1;
		}
		
		int s= downright(i-1, j);
		
		int m=	downright(i, j-1);
	
		return s+m;
		
	}
}
