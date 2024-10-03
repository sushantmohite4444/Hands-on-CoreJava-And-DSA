package dsa;

import java.util.Arrays;

public class Sort_Merge_With_New_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 2, 6, 7, 8098, 12, 1, 5 };
		System.out.println(Arrays.toString(Divide(arr)));
//		Divide(arr);
	}

	public static int[] Divide(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}

		int m = arr.length / 2;

		int[] left = Arrays.copyOfRange(arr, 0, m);
		int[] right = Arrays.copyOfRange(arr, m, arr.length);
		int[] Left = Divide(left);
		int[] Right = Divide(right);

		return Merge(Left, Right);

	}

	public static int[] Merge(int[] Left, int[] Right) {

		int[] Mixarr = new int[Left.length + Right.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < Left.length && j < Right.length) {

			if (Left[i] < Right[j]) {
				Mixarr[k] = Left[i];
				i++;
			} else {
				Mixarr[k] = Right[j];
				j++;
			}
			k++;
		}
		while (i < Left.length) {
			Mixarr[k] = Left[i];
			i++;
			k++;
		}
		while (j < Right.length) {
			Mixarr[k] = Right[j];
			j++;
			k++;
		}

		return Mixarr;
	}

}
