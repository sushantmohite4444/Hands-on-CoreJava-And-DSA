package recurtionproblems;
public class Removenextduplicate {
	static int i=0;
	public static void rad(String str ) {
		
		if(str.length()==i+1) {
			System.out.println(str);
			return;
		}
	
			if(str.charAt(i)==str.charAt(i+1)) {
				str=str.substring(0,i) + str.substring(i+2);
				i=0;
			}
				i++;
			rad(str);
		}
	
	public static void main(String[] args) {
		String str= "sabbcddcauoosiih";
		rad(str);
	}

}
