import java.util.Scanner;
public class Switchapp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input");
		String x = input.nextLine();
		switch (x) {
		case "hello":
			System.out.println("Correct");
			break;
		default:
			System.out.println("Wrong");
		}
	}
}
