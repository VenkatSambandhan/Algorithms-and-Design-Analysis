import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String input1 = "abcdef";
		char[] input4 = input1.toCharArray();
		String input2 = "dedsfabc";
		char[] input3 = input2.toCharArray();
		Arrays.sort(input3);
int i;
		for(i=0;i<input1.length();i++) {
			if(input3[i]!=input4[i])
				break;
	}

		if(i!=input1.length())
			System.out.println("Not an anagram");
		else
			System.out.println("It is an anagram");
}
}
