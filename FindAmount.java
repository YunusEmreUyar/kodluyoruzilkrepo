import java.util.Scanner;

public class FindAmount {
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		float openCost = 10f, amountPerKm = 2.20f;
		float km, totalAmount;
		System.out.println("Enter how many kilometers you want to go:");
		km = inp.nextFloat();
		totalAmount = (km*amountPerKm)>20? km*amountPerKm+10: 20;
		System.out.println(totalAmount);
	}
}