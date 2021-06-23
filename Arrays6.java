import java.util.Scanner;

public class Arrays6 {
    
    static void updateResult(int[][] arr, int val) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i][0] == val) {
                arr[i][1]++;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many items will you enter?: ");
        int n = in.nextInt();
        int[] list = new int[n];
        int[][] result = new int[n][2];

        for(int i = 0; i<n; i++) {
            System.out.print("Enter " + (i+1) +". number: ");
            list[i] = in.nextInt();
        }
        for(int i=0; i<n; i++) {
            result[i][0] = list[i];
            result[i][1] = 0;
        }

        for(int i=0; i<n; i++) {
            updateResult(result, list[i]);
        }

        for(int[] item: result) {
            System.out.println(item[0] + ", " + item[1] + " times repeated.");
        }
        in.close();
    }
}
