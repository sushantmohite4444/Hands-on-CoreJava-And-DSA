package dsa;

public class Sort_Bubble {
	public static void main(String[] args) {
		int arr[] = { 12, 1, 23, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			boolean abc = true;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					abc = false;
				}

			}
			if (abc)
				break;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
