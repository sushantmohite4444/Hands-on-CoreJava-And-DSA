package dsa;

public class Sort_Insertion {

	public static void main(String[] args) {
		int arr[] = { 12, 1, 23, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {

				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
