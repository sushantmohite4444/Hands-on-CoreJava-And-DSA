package dsa;

public class Subset_Of_String_Using_Recurtion {

	public static void main(String[] args) {

		String s = "abc";
		Subset("", s);
	}

	public static void Subset(String string, String s) {

		if (s.isEmpty()) {
			if (!string.isEmpty())
				System.out.println(string);
			return;
		}

		char c = s.charAt(0);
		String n = s.substring(1);

		// Sequence change by changing subset
		Subset(string + c, n);
		Subset(string, n);

	}

}
