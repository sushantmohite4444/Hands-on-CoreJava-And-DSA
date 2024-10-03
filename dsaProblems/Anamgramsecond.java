package arrays;

import java.util.Scanner;
public class Anamgramsecond {


	    static boolean isAnagram(String o, String p) {
	        
	      String a= o.toLowerCase();
	      String b = p.toLowerCase();
	      if(a.length()!=b.length()) return false;
	        
	        for(int i=0 ;i<a.length();i++){
	        	int af=0,bf=0;
	            
	            for(int j=0;j<a.length();j++) {
	            	
	            	if(a.charAt(i)==a.charAt(j)) af++;
	            	if(a.charAt(i)==b.charAt(j)) bf++;
	            }
	            if(af==bf) continue;
	            else  return false;
	        }
	         
	        return true;
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

