package dsa;

public class Sort_cycle___1_To_n_number {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 2, 6, 3, 1 };
		int i = 0;
//		while (i < arr.length) {
//
//			int current = arr[i];
//
//			if (arr[i] != i + 1) {
//
//				int temp = arr[current - 1];
//				arr[current - 1] = arr[i];
//				arr[i] = temp;
//
//			} else {
//				i++;
//			}
//
//		}
		
		while (i < arr.length) {

			int current = arr[i]-1;

			if (arr[i] != arr[current]) {      // we have duplicate items

				int temp = arr[current ];
				arr[current ] = arr[i];
				arr[i] = temp;

			} else {
				i++;
			}

		}
		
		for (int J : arr) {
			System.out.print(J + " ");
		}

	}
}
