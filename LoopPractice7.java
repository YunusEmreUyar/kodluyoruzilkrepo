import java.util.Scanner;

public class LoopPractice7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        double n = in.nextInt();
        double result = 0;

        while (n > 0) {
            result += (1/n);
            n--;
        }

        System.out.println(result);
        in.close();
    }
}