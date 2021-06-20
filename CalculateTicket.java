import java.util.Scanner;

public class CalculateTicket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter how many kilometers you want to go?");
        double km = in.nextDouble();
        if (km > 0) {
            System.out.println("What is your age?");
            int age = in.nextInt();
            System.out.println("Roundtrip? (1 => yes, 2 => no)");
            int directionCount = in.nextInt();
            double cost = km * 0.1;

            if (age < 12) {
                cost *= 0.5;
            } else if (age >= 12 && age < 24) {
                cost *= 0.9;
            } else if (age > 65) {
                cost *= 0.7;
            } else if (age < 1) {
            }
            
            if (directionCount == 2) {
                cost = (cost*0.8)*2;
            } else if (directionCount == 1) {}
            else {
                System.out.println("You entered wrong input.");
            }
            
            System.out.println(cost);
        } else {
            System.out.println("Program closed.");
        }
        
    }
}