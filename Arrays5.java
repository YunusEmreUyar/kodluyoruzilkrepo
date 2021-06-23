import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Take input len
        System.out.print("How many items will you enter?: ");
        int n = in.nextInt();
        int[] list = new int[n];

        // Take list elems
        for(int i = 0; i<n; i++) {
            System.out.print("Enter " + (i+1) +". number: ");
            list[i] = in.nextInt();
        }

        // bubble sort
        for(int i=0; i<n;i++) {
            for(int j=0; j<n; j++) {
                if(list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        
        // Print result
        System.out.println(Arrays.toString(list));
    }
}
