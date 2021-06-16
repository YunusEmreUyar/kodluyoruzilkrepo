import java.util.Scanner;

public class GreengrocerCalculator {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		float temp;
		float totalAmount = 0.0f;
		float pearMultiplier = 2.14f, appleMultiplier = 3.67f, tomatoMultiplier = 1.11f;
		float bananaMultiplier = 0.95f, eggplantMultiplier = 5.0f;

		System.out.println("Pear:");
		temp = inp.nextFloat();
		totalAmount += temp*pearMultiplier;
		System.out.println("Apple:");
		temp = inp.nextFloat();
		totalAmount += temp*appleMultiplier;
		System.out.println("Tomato:");
		temp = inp.nextFloat();
		totalAmount += temp*tomatoMultiplier;
		System.out.println("Banana:");
		temp = inp.nextFloat();
		totalAmount += temp*bananaMultiplier;
		System.out.println("Eggplant:");
		temp = inp.nextFloat();
		totalAmount += temp*eggplantMultiplier;
		System.out.println("Total amount is:" + totalAmount);
	}
}