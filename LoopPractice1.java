import java.util.Scanner;

public class LoopPractice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int value = in.nextInt();
        int counter = 0, total = 0;

        for(int i=0; i<=value; i++) {
            // 3 ve 4'e bölünebilmek 12'ye bölünebilmektir.
            if(i%12==0) {
                total += i;
                counter++;
            }
        }

        System.out.println(total/counter);

        in.close();
    }
}