import java.util.Scanner;

public class LoopPractice6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int val = in.nextInt();
        int total=0, util=0;
        
        while(val != 0) {
            total += (val%10);
            val /= 10;
            ++util;
        }

        System.out.println(total);
        in.close();
    }   
}