
public class Loops {
	public static void main(String[] args) {
		int value = 0;
		while (value < 10) {
			System.out.println(value);
			value += 2;
			if(value==8)
				break;
		}
		int i;
		for (i = 1; i < 10; i++) {
			System.out.printf("Value: %d \n", i);
		}
		boolean x = false;
		if (x) {
			System.out.println("true");
		} else {
			System.out.println(x);
		}
	}
}
