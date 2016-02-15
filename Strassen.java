//Code to compare run time of Standard and Strassen's matrix multiplication methods

public class Strassen {

	public float[][] calculate(float[][] A, float[][] B, int x) {
		int n = x;
		float[][] R = new float[n][n];

		if (n == 1) {
			R[0][0] = A[0][0] * B[0][0];
			return R;
		}

		else {
			float[][] A11 = new float[n / 2][n / 2];
			float[][] A12 = new float[n / 2][n / 2];
			float[][] A21 = new float[n / 2][n / 2];
			float[][] A22 = new float[n / 2][n / 2];
			float[][] B11 = new float[n / 2][n / 2];
			float[][] B12 = new float[n / 2][n / 2];
			float[][] B21 = new float[n / 2][n / 2];
			float[][] B22 = new float[n / 2][n / 2];

			float[][] S1 = new float[n / 2][n / 2];
			float[][] S2 = new float[n / 2][n / 2];
			float[][] S3 = new float[n / 2][n / 2];
			float[][] S4 = new float[n / 2][n / 2];
			float[][] S5 = new float[n / 2][n / 2];
			float[][] S6 = new float[n / 2][n / 2];
			float[][] S7 = new float[n / 2][n / 2];
			float[][] S8 = new float[n / 2][n / 2];
			float[][] S9 = new float[n / 2][n / 2];
			float[][] S10 = new float[n / 2][n / 2];

			/// Divide the matrix A into four equal parts
			submatrix(A, A11, 0, 0);
			submatrix(A, A12, 0, n / 2);
			submatrix(A, A21, n / 2, 0);
			submatrix(A, A22, n / 2, n / 2);
			// Divide matrix B into four equal parts
			submatrix(B, B11, 0, 0);
			submatrix(B, B12, 0, n / 2);
			submatrix(B, B21, n / 2, 0);
			submatrix(B, B22, n / 2, n / 2);

			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < n / 2; j++) {
					// System.out.println(S1[i][j]);
					S1[i][j] = B12[i][j] - B22[i][j];
					S2[i][j] = A11[i][j] + A12[i][j];
					S3[i][j] = A21[i][j] + A22[i][j];
					S4[i][j] = B21[i][j] - B11[i][j];
					S5[i][j] = A11[i][j] + A22[i][j];
					S6[i][j] = B11[i][j] + B22[i][j];
					S7[i][j] = A12[i][j] - A22[i][j];
					S8[i][j] = B21[i][j] + B22[i][j];
					S9[i][j] = A11[i][j] - A21[i][j];
					S10[i][j] = B11[i][j] + B12[i][j];
					// System.out.println(S5[i][j]);
					// System.out.println(S10[i][j]);
				}
			}

			// System.out.println(S1[i][j]);
			/*
			 * for(int w =1; w < z; w ++ ) { for()
			 */
			float[][] P1 = new float[n / 2][n / 2];
			float[][] P2 = new float[n / 2][n / 2];
			float[][] P3 = new float[n / 2][n / 2];
			float[][] P4 = new float[n / 2][n / 2];
			float[][] P5 = new float[n / 2][n / 2];
			float[][] P6 = new float[n / 2][n / 2];
			float[][] P7 = new float[n / 2][n / 2];

			P1 = calculate(A11, S1, n / 2);
			P2 = calculate(S2, B22, n / 2);
			P3 = calculate(S3, B11, n / 2);
			P4 = calculate(A22, S4, n / 2);
			P5 = calculate(S5, S6, n / 2);
			P6 = calculate(S7, S8, n / 2);
			P7 = calculate(S9, S10, n / 2);
			// System.out.println("Value of p1:" + P1[0][0]);
			// System.out.println(P2[0][0]);
			// System.out.println(P3[0][0]);
			// System.out.println(S10[0][0]);

			float[][] C11 = new float[n / 2][n / 2];
			float[][] C12 = new float[n / 2][n / 2];
			float[][] C21 = new float[n / 2][n / 2];
			float[][] C22 = new float[n / 2][n / 2];

			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < n / 2; j++) {
					C11[i][j] = P5[i][j] + P4[i][j] - P2[i][j] + P6[i][j];
					C12[i][j] = P1[i][j] + P2[i][j];
					C21[i][j] = P3[i][j] + P4[i][j];
					C22[i][j] = P5[i][j] + P1[i][j] - P3[i][j] - P7[i][j];
				}
			}

			combiner(C11, R, 0, 0);
			combiner(C12, R, 0, n / 2);
			combiner(C21, R, n / 2, 0);
			combiner(C22, R, n / 2, n / 2);
		}
		return R;
	}

	// submatrix parent matrix into child matrices
	public void submatrix(float[][] a, float[][] submatrix, float k, float jB) {
		for (int i = 0, i2 = (int) k; i < submatrix.length; i++, i2++)
			for (int j = 0, j2 = (int) jB; j < submatrix.length; j++, j2++) {
				submatrix[i][j] = a[i2][j2];
				// System.out.print(submatrix[i][j]);
			}
		// System.out.println();
	}

	public void combiner(float[][] C, float[][] P, int k, int jB) {
		for (int i = 0, i2 = k; i < C.length; i++, i2++)
			for (int j = 0, j2 = jB; j < C.length; j++, j2++) {
				P[i2][j2] = C[i][j];
				// System.out.print(P[i2][j2] + " ");
			}
		// System.out.println();
	}

	public static void main(String[] args) {
		int n = 4;

		for (int k = 2; k <= n; k *= 2) {
			System.out.println("Size N: " + k);
			float[][] A = new float[k][k];
			float[][] B = new float[k][k];
			// Matrix A and B randomly generated..
			System.out.println("Matrix A");
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					A[i][j] = (float) (Math.random() * (10 - 0));
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("Matrix B");
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					B[i][j] = (float) (Math.random() * (10 - 0));
					System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}

			// Standard Multiplication Method
			float[][] matrixoutput = new float[k][k];
			System.out.println();
			System.out.println("Output Matrix: Standard Multiplication ");

			// long startTime = System.nanoTime();
			long startTime = System.currentTimeMillis();
			for (int m = 0; m < k; m++) {
				for (int p = 0; p < k; p++) {
					matrixoutput[m][p] = 0;
					for (int o = 0; o < k; o++) {
						matrixoutput[m][p] = matrixoutput[m][p] + (A[m][o] * B[o][p]);
					}
					System.out.print(matrixoutput[m][p] + " ");
				}
				System.out.println();
			}
			System.out.println();
			// System.out.println();

			// long endTime = System.nanoTime();
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;

			// Strassen's method
			Strassen s = new Strassen();
			// System.out.println("Value of k:" +k);
			startTime = System.currentTimeMillis();
			float[][] C = s.calculate(A, B, k);
			endTime = System.currentTimeMillis();
			totalTime = endTime - startTime;

			System.out.println("Output Matrix: Strassen's Method ");
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					System.out.print(C[i][j] + " ");
					// System.out.print(B[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

// REFERENCES:
// http://www.sanfoundry.com/java-program-strassen-algorithm/