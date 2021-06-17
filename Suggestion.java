import java.util.Scanner;
public class Suggestion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temperature;
        System.out.println("Enter temperature as C: ");
        temperature = inp.nextInt();

        if (temperature < 5) {
            System.out.println("Skiing recommended.");
        } else if (temperature > 5 && temperature < 15) {
            System.out.println("Cinema recommended.");
        } else if (temperature > 10 && temperature < 25) {
            System.out.println("Picnic recommended.");
        } else {
            System.out.println("Swimming recommended.");
        }
    }
}
