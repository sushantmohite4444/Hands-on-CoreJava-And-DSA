package deepPractice;

import java.util.Scanner;

//Customize  exception

class firstexception extends RuntimeException {

	firstexception(String s) {
					super(s);
	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 to get Exception");
		int num = sc.nextInt();
		
		
		if(num==1) {
			throw new firstexception("Number is one ");
		}
	}

}
