package dsaProblems;

import java.util.ArrayList;

public class Permutation {
 public static void main(String[] args) {
	permu("","abc");
//	ArrayList<String> arr=permuarr("", "abc");
//	for (String string : arr) {
//		System.out.println(string);
//	}
}

private static void permu(String string, String string2) {
	
	if(string2.isEmpty()) {
		
		System.out.println(string);
		return;
	}
	
	char ch= string2.charAt(0);
	for (int i = 0; i <=string.length(); i++) {
		
		String first= string.substring(0,i) + ch + string.substring(i,string.length());
	
		permu(first, string2.substring(1));
	}

}

private static ArrayList<String> permuarr(String string, String string2) {
	
	if(string2.isEmpty()) {
		
		ArrayList<String> list =new ArrayList<>();
		list.add(string);
		return list;
	}
	
	ArrayList<String> arr= new ArrayList<>();
	
	char ch= string2.charAt(0);
	for (int i = 0; i <=string.length(); i++) {
		
		String first= string.substring(0,i) + ch + string.substring(i,string.length());
	
	arr.addAll(permuarr(first, string2.substring(1)));
	
	
	}
	
	
	return arr;

}
}
