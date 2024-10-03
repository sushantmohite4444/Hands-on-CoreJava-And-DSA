package dsa;

public class Sort_Selection_Sort {

	public static void main(String[] args) {
		int arr[] = { 12, 1, 23, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {

			int large = arr[0];
			int ind = 0;
			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] > large) {
					large = arr[j];
					ind = j;
				}

			}
			int temp = arr[ind];
			arr[ind] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
