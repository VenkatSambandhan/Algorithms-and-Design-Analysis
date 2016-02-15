
public class SubString {

	public static void main(String[] args) {
		String s1 = "llohe";
		String s2 = "hello";
		String s1s1 = s1 + s1;
		if(s1s1.contains(s2))
			System.out.println("s2 is a rotation of s1");
		else
			System.out.println("s2 is not a rotation of s1");
	}
}
