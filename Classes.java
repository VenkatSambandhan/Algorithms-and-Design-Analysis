class Person {
	String name;
	int age;

	void speak() {
		System.out.println("hello");
	}

	int retire() {
		int x = 60 - age;
		return x;
	}
}

public class Classes {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "Venkat";
		p1.age = 25;
		p1.speak();
		System.out.println("My name is: " + p1.name);
		int y = p1.retire();
		System.out.println("My retirement age is: " + y);
	}

}
