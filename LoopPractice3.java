import java.util.Scanner;

public class LoopPractice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pow4 = "Powers of 4: ", pow5 = "Powers of 5: ";

        System.out.print("Enter a number: ");
        int val = in.nextInt();
        for(int i=1; i<=val; i*=4) {
            pow4 += i + " ";
        }
        for(int i=1; i<=val; i*=5) {
            pow5 += i + " ";
        }
        System.out.println(pow4 + "\n" + pow5);
        in.close();
    }

}