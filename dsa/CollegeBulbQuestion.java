package dsa;

public class CollegeBulbQuestion {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 1, 1, 1, 2, 2, 1, 2 };
		System.out.println(noofbulb(arr));
	}

	public static int noofbulb(int arr[]) {
		int i = 0;
		int ans = 0;
		int b = 0;

		while (i < arr.length) {

			if (b == 2) {
				break;
			}
			if (arr[i] != arr[i + 1]) {
				b++;
			}

			ans++;
			i++;

		}
		return ans;
	}

}
