import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n = in.nextInt();
        int[] arr = new int[n];
        double mean = 0;

        for(int i=0; i<n; i++) {
            System.out.print("Bir sayı girin: ");
            arr[i] = in.nextInt();
        }
        for(int i: arr) {
            mean += 1/i;
        }
        mean = n/mean;
        System.out.println(mean);

        in.close();
    }
}
