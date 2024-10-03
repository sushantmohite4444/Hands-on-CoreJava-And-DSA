package arrays;

import java.util.Scanner;

public class Substringsmlg {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = "";

		for (int i = 0; i < s.length() - k + 1; i++) {

			String st = s.substring(i, i + k);
			if (st.compareTo(smallest) < 0)
				smallest = st;
			if (st.compareTo(largest) > 0)
				largest = st;

		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
