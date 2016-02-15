
public class Sorting {

	public static void main(String[] args) {
		int a[] = { 5, 2, 3, 1, 4, 7, 6 };
		int n = a.length;
		int i, j, key;
		for (j = 1; j < n - 1; j++) {
			key = a[j];
			i = j - 1;
			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i = i - 1;
			}
			a[i + 1] = key;
		}

		for (j = 0; j < n; j++) {
			System.out.println(a[j]);
		}
	}
}
