import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total2 = 0, total4 = 0; 
        int value;
        do {
            System.out.println("Enter a number: ");
            value = in.nextInt();
            if(value%2==0) {
                total2 += value;
            } else if (value%4==0) {
                total4 += value;
            }

        } while(value%2==0);
        System.out.println(total2 + "\n" + total4);
        
        in.close();
    }
}