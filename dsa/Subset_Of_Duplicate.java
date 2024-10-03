package dsa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_Of_Duplicate {
	public static void main(String[] args) {
		
		System.out.println(duplicate("cabc"));
		
	}
	
//	first sort them  if Duplicate not in in continuous order
	
	
	public static List<List<Character>> duplicate(String s) {
		
	  char[] c = s.toCharArray();
	    Arrays.sort(c);
	    
	    s= new String(c);
	    
		List<List<Character>> st=new ArrayList<>();
		st.add(new ArrayList<>());
		int start =0;
		int end=0;
		
		for (int i = 0; i <s.length(); i++) {
			
			if(i>0 && s.charAt(i)==s.charAt(i-1)) {
				start=end+1;
			}
			end= st.size()-1;
			int n =st.size();
			for (int j = start; j <n ; j++) {
				
				ArrayList<Character> ch =new ArrayList<>(st.get(j));
				ch.add(s.charAt(i));
				st.add(ch);
				
			}
		}
		
		return st;
		
	}

}
