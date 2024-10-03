package dsa;


import java.util.ArrayList;
import java.util.List;

public class Subset_Of_String_Using_iteration {

	public static void main(String[] args) {
		
		String s="abcd";
		
		List<List<Character>> st= subset(s);
		for (int i = 0; i < st.size(); i++) {
			
			System.out.print(i);
			System.out.println(st.get(i));
			
//			for (int j = 0; j < st.get(i).size(); j++) {
//				
//			}
			
		}

	}
	
	static List<List<Character>> subset(String s) {
		
		List<List<Character>> st=new ArrayList<>();
		
		st.add(new ArrayList<>());
		
		for (int i = 0; i < s.length(); i++) {
			
			int n=st.size();
//			for (int j = 0; j <st.size(); j++) infinite loop 
			for (int j = 0; j <n; j++) {
			ArrayList<Character> ist= new ArrayList<Character>(st.get(j));
//			System.out.println(s.charAt(i));
			ist.add(s.charAt(i));
			st.add(ist);
			}
		}
		
		return st;
		
	}

}
