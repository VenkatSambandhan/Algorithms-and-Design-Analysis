import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);   // create scanner object
		int line;
		do
		{
			
			System.out.println("Enter a number");
			line = input.nextInt();           // wait for the user to enter a line
		
		System.out.println(line);
		
		
	}
		while(line!=5);
	}
}
