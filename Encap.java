class Encap1 {
	private int id;

	public int getId() {
		return id;
	}

	
	public int setId(int id) {
		this.id = id;
		return id;
	}
	
}


public class Encap {

	public static void main(String[] args) {
		
Encap1 en1 = new Encap1();
int x = en1.setId(7);
System.out.println(x);
System.out.println(Double.MAX_VALUE);
int y = 123;
float z = (float)y;
System.out.println(z);

String text = "Hello";
System.out.println(text.length());
	}

}
