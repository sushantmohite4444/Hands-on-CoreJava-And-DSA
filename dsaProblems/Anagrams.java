package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {



	    static boolean isAnagram(String a, String b) {
	    	
	    	char arr [] = a.toCharArray();
	    	char arr1[] = b.toCharArray();
	    	
	    Arrays.sort(arr);
	    Arrays.sort(arr1);
	    
	    String s= new String(arr);
	   String t =new String(arr1) ;
	    	if(s.equalsIgnoreCase(t)) {
	    		return true;
	    	}
	        
	    	return false;
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



