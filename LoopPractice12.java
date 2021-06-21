import java.util.Scanner;

public class LoopPractice12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = in.nextInt();
        int total = 0;

        for(int i=1; i<num; i++) {
            if(num%i==0) {
                total += i;
            }
        }
        if(num == total) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}