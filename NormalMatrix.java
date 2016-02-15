
public class NormalMatrix {

	public static void main(String[] args) {

		int i = 0, j = 0;
		float n = 512;
		float[][] matrixinput1 = new float[1000][1000];
		float[][] matrixinput2 = new float[1000][1000];
		float r = (float) Math.random();
		for (int x = 2; x <= n; x++) { // n matrixes (1*1, 2*2, 3*3 .... 10*10)
		//	System.out.println("Intput Matrix1 ");
			for (i = 0; i < x; i++) {
				for (j = 0; j < x; j++) {
					matrixinput1[i][j] = (float) (Math.ceil(r) * 100);
					// System.out.print(matrixinput1[i][j] + " ");
				}
				// System.out.println();
			}
			// System.out.println();
			// System.out.println();

			// n matrixes (1*1, 2*2, 3*3 .... 10*10)
		//	System.out.println("Intput Matrix2 ");
			for (i = 0; i < x; i++) {
				for (j = 0; j < x; j++) {
					matrixinput2[i][j] = (float) (Math.ceil(Math.random() * 100));
					// System.out.print(matrixinput2[i][j] + " ");
				}
				// System.out.println();
			}
			// System.out.println();
			// System.out.println();

			// n matrixes (1*1, 2*2, 3*3 .... 10*10)
			float[][] matrixoutput = new float[x][x];
		//	System.out.println("Output Matrix ");

		//	long startTime = System.nanoTime();
			 long startTime = System.currentTimeMillis();
			for (i = 0; i < x; i++) {
				for (j = 0; j < x; j++) {
					matrixoutput[i][j] = 0;
					for (int k = 0; k < x; k++) {
						matrixoutput[i][j] = matrixoutput[i][j] + (matrixinput1[i][k] * matrixinput2[k][j]);
						matrixoutput[i][j] = matrixoutput[i][j] + (matrixinput1[i][k] * matrixinput2[k][j]);
					}
					// System.out.print(matrixoutput[i][j] + " ");
				}
				// System.out.println();
			}
			// System.out.println();
			// System.out.println();

		//	long endTime = System.nanoTime();
			 long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("Value of N: " + x + "   Runtime: " +totalTime);
		}
	}
}
