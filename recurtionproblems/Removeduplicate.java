package recurtionproblems;



public class Removeduplicate {

	static boolean arr[] = new boolean[26];
	static int i=0;
	public static void rd(String str, String newstr) {
		if(i==str.length()) {
			System.out.println(newstr);
			return;
		}
		
		char c=str.charAt(i);
		i++;
	
		int j= c-'a';
		if(arr[j]==false) {
			arr[j]=true;
			rd(str, newstr + c);
		}
		else {
			rd(str, newstr);
		}
//		for(int i=0;i<str.length();i++) {
//			char c=str.charAt(i);
//			int j = c-'a';
//			if(arr[j]==false) {
//				arr[j]=true;
//				newstr=newstr+c;
//			}
//		}
		
		
		
		
	}
	public static void main(String[] args) {
		String str= "aaa";
		int length =str.length();
		
	rd(str ,"");
	}

}
