package dsaProblems;

public class Remove_Pertiqular_Char {
	public static void main(String[] args) {
		
//		drop(" ","arrfadddffssaaasdf");
//		System.out.println(drop("arrfadddffssaaasdf"));
		
		System.out.println(dropapple(" I want to eat apple ok "));
	}

	private static String dropapple(String string) {
		
		if(string.isEmpty()) {
			return "";
		}
	
		if(string.startsWith("apple")) {
			return dropapple(string.substring(5));
		}else {
			return string.charAt(0) +dropapple(string.substring(1));
		}
		
	}

	private static String drop(String string) {
		if(string.isEmpty()) {
			return "";
		}
		
		char ch= string.charAt(0);
		if(ch== 'a') {
			return drop(string.substring(1));	
		}
		else {
			return ch + drop(string.substring(1));
		}
	}

	private static void drop(String string, String string2) {
		
		if(string2.isEmpty()) {
			System.out.println(string);
			return;
		}
		
		char ch = string2.charAt(0);
		
		if(ch=='a') {
			drop(string, string2.substring(1));
		}
		else {
			drop(string+ch, string2.substring(1));
		}
	}

}
