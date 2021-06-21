import java.util.Scanner;

public class LoopPractice11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers you going to enter: ");
        int N = in.nextInt();
        int min = 0, max = 0;
        String msg = "You entered: ";

        for(int i=1; i<=N; i++) {
            System.out.print("Enter " + i + "th number: ");
            int num = in.nextInt();
            msg += num + " ";
            if(i==1) {
                min = num;
            }
            if(num<min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        
        System.out.println(msg);
        System.out.println("Max is: " + max + "\n" + "Min is: " + min);
        in.close();
    }
}