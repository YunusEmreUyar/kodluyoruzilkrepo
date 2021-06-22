import java.util.Scanner;

public class MethodsPrac6 {

    static String msg = "";
    static int startPoint;

    static void printPattern(int n, boolean returningBack) {
        if(n<=0) {
            msg += " " + n;
            System.out.println("Current n is: " +n);
            printPattern(n+5, true);
        } else if (n>0 && returningBack && n<=startPoint) {
            msg += " " + n;
            System.out.println("Current n is: " +n);
            printPattern(n+5, returningBack);
        } else if (n>0 && !returningBack) {
            System.out.println("Current n is: " +n);
            msg += " " + n;
            printPattern(n-5, returningBack);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        startPoint = in.nextInt();

        printPattern(startPoint, false);
        System.out.println(msg);
        in.close();
    }
}
