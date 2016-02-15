
public class Recursion {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		int x = calculate(4);
		System.out.println(x);
		long end = System.currentTimeMillis();
		long total = end - start;
	}

	public static int calculate(int num) {

		int x = num;
		if (x == 1) {
			return 1;
		}
		x = num - 1;
		return calculate(num - 1) * num;
	}
}
