import java.util.Scanner;

public class Java101Homework1 {
	public static void main(String[] args) {
		float length, mass, index;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Give me your length as meter:");
		length = inp.nextFloat();
		System.out.println("Give me your mass as kilogram:");
		mass = inp.nextFloat();
		index = mass/(length*length);
		System.out.println("Your index is: " + index);
	}
}