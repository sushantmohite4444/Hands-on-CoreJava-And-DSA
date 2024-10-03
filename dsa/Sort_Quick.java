package dsa;

import java.util.Arrays;

public class Sort_Quick {

	public static void main(String[] args) {

		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static void Quick(int[] arr, int Low, int High) {
		if (Low >= High) {
			return;
		}
		int s = Low;
		int e = High;
		int m = s + (e - s) / 2;

		while (s <= e) {

			while (arr[s] < arr[m]) {
				s++;
			}
			while (arr[e] > arr[m]) {
				e--;
			}
			if (s <= e) {

				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		Quick(arr, Low, e);
		Quick(arr, s, High);

	}
}
