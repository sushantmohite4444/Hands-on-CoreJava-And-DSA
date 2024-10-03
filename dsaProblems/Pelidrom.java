package arrays;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Pelidrom {



	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        if(A.length()<50 && A.equals(A.toLowerCase())){
	        
	        StringBuffer st = new StringBuffer();   
	        st.append(A);
	        st.reverse();
	        System.out.println(st);
	        
	        boolean bool=st.equals(A);
	        System.out.println(bool);
	            if(A.equals(st.toString())) System.out.println("Yes");
	           
	        }
	        
	    }
	}





