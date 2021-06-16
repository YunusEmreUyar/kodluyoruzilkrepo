import java.util.Scanner;

public class FindCircleStuff {
	public static void main(String[]args) {
		float pi = 3.14f;
		float radius, area, circumference;
		Scanner inp = new Scanner(System.in);
		System.out.println("Give me circle radius:");
		radius = inp.nextFloat();
		area = pi*radius*radius;
		circumference = 2* pi* radius;
		System.out.println("Area is:" + area + "\n" + "Circumference is:" + circumference);
	}
}