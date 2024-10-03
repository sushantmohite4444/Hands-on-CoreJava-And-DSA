package recurtionproblems;

import java.util.HashSet;

public class Subsequences {
	
	public static void  suqu(String str,int ind,String newstr,HashSet<String> sh) {
		if(ind==str.length()) {
			if(sh.contains(newstr)) {
				return;
			}
			else {
				System.out.println(newstr);
				sh.add(newstr);
				return;
			}
		}
		
		char current = str.charAt(ind);
		suqu(str, ind+1, newstr+current,sh);
		
		suqu(str, ind+1, newstr,sh);
	}
	
	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<>();
		
		String str ="abc";
		
		suqu(str, 0, "",hs);
	}	
	}


