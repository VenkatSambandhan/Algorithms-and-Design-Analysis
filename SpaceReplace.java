
public class SpaceReplace {

	public static void main(String[] args) {
		String input = "Hel ll o ";
		int count = 0;
		char[] input1 = input.toCharArray();

		for (int x = 0; x < input1.length; x++) {
			if (input1[x] == ' ')
				count++;
		}
		int length = input1.length;
		int newlength = length + (count * 2);
		char[] input2 = new char[newlength + 1];
		System.out.println("new length:" + newlength);
		input2[newlength] = '\0';
		System.out.println("Original lenght: " + input1.length);
		
		for (int y = input1.length - 1; y >= 0; y--) {
			if (input1[y] == ' ') {
				input2[newlength - 1] = '0';
				input2[newlength - 2] = '2';
				input2[newlength - 3] = '%';
				newlength = newlength - 3;
			} else {
				input2[newlength - 1] = input1[y];
				newlength = newlength - 1;
			}
		}
		System.out.println(input2);
	}
}
