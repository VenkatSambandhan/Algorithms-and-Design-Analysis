import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) throws FileNotFoundException {
	String txt = "venkat.txt";
		File filename = new File(txt);
		Scanner in = new Scanner(filename);
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}

	}

}
