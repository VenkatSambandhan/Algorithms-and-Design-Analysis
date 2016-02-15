
public class StringBuild {

	public static void main(String[] args) {
		String[] words = { "Hello", "World", "Bye!!!" };
		String x = Build(words);
		System.out.println(x);

		
	}

	public static String Build(String[] words) {
		StringBuilder sb = new StringBuilder();
		for (String value : words) {
			sb.append(value);
		}
		return sb.toString();
	}
}
