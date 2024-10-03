package arrays;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		int o=0;
		Scanner sc =new Scanner(System.in);
		
		String f1,f2;
		
		
		f1=sc.nextLine();  
		
		f2=sc.nextLine();
		
		StringBuffer p = new StringBuffer();
		p.append(f2);
		
		for(int i=0 ;i < f1.length() && i< p.length();i++) {
			

		if(f1.charAt(i) == p.charAt(i)) {
			p.replace(i, i+1, "#");
			System.out.println(p);
			o=o+2;	
		}
		else {
		for (int j = 0; j < p.length(); j++) {
			if(f1.charAt(i) == p.charAt(j)) {
				System.out.println(i);
				o = o + 1;
			p.replace(j, j+1, "#");
			System.out.println(p);
			}
		}
		}
		
//		System.out.println(p.charAt(i));
		
		
	}
	System.out.println(o);
}
}
