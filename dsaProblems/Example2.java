package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static String sortarr(String s1, String s2) {
		String b = "yes";

		if (s1.length() != s2.length()) {
			b = "no";
		} else {
			
			char charArray[] = s1.toCharArray();
			Arrays.sort(charArray);
			s1 = new String(charArray);

			char charArray1[] = s2.toCharArray();
			Arrays.sort(charArray1);
			s2 = new String(charArray1);

			if (!s1.equals(s2)) {
				b = "no";
			}
		}
		return b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.nextLine();
		s2 = sc.nextLine();

		String b = sortarr(s1, s2);

		System.out.println(b);

	}

}
