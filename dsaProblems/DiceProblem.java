package dsaProblems;

public class DiceProblem {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,};
		int target =4;
		
		sum("", target);
	}

	private static void sum(String p, int target) {
		
		if(target== 0) {
			System.out.println("------------------------"+p+"------------------------");
			return;
		}
			System.out.print("pppp=="+p+ " target== " + target);
		for(int i=1;i<=6 && i<=target;i++) {
			System.out.println("  i ==============="+i);
			sum(p+i, target-i);
			
		}
	}

}
