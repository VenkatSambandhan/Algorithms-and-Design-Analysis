
public class MatrixZeroes {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 5 }, { 4, 0, 6, 7 }, { 7, 8, 9, 4 }, { 4, 5, 0, 11 } };
		zeroes(matrix);
	}

	public static void zeroes(int matrix[][]) {
		if (matrix == null || matrix.length == 0)
			return;

		int m = matrix.length;
		int n = matrix[0].length;
		System.out.println("Length of rows:" + m);
		System.out.println("Length of columns:" + n);
		int[] row = new int[m];
		int[] column = new int[n];
		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				if (matrix[x][y] == 0) {
					row[x] = 1;
					column[y] = 1;

				}
			}
		}

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				if (row[x] == 1 || column[y] == 1) {
					System.out.print(matrix[x][y] = 0);
				} else {
					System.out.print(matrix[x][y]);
				}

			}
			System.out.println();
		}

	}
}
