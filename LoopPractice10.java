import java.util.Scanner;

public class LoopPractice10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstN = in.nextInt();
        System.out.print("Enter second number: ");
        int secondN = in.nextInt();
        int ebob=1, ekok;

        int i = 1;
        while (i <= firstN && i<= secondN) {
            if(firstN %i==0 && secondN%i==0) {
                ebob = i;
            }
            i++;
        }
        ekok = (firstN*secondN)/ebob;
        System.out.println("Ebob is: " + ebob + "\n" + "Ekok is: " + ekok);
        in.close();
    }
}