package dsaProblems;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Substring {
	public static void main(String[] args) {
		
//		Substring("","abc");
		Set<String> arr=new LinkedHashSet<>();
		Substringarr("","abca",arr);
		for (String string : arr) {
			System.out.println(string);
		}
	}

	private static void Substringarr(String string, String string2,Set<String> arr) {
	
		if(string2.isEmpty()) {
			arr.add(string);
			return;
		}
		
		char ch=string2.charAt(0);
		Substringarr(string+ch, string2.substring(1), arr);
		Substringarr(string, string2.substring(1), arr);
	}

	private static void Substring(String string, String string2) {
		
		if(string2.isEmpty()) {
			System.out.println(string);
			return ;
		}
		
		char ch = string2.charAt(0);
		Substring(string + ch, string2.substring(1));
		Substring(string, string2.substring(1));
		
	}

}
