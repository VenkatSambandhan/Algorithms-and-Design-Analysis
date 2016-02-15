
public class Quad {

	public static void main(String[] args) {
		double b = -3;
		double a = 1;
		double c = -4;
		double x = ((- b) + (Math.sqrt((b*b) - (4*a*c))))/(2*a);
		double y = ((- b) - (Math.sqrt((b*b) - (4*a*c))))/(2*a);
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
	}
}
