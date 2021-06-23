import java.util.Arrays;
import java.util.Scanner;

public class arrays4 {
    
    static boolean checkHasFoundAlready(int[] arr, int value) {
        for(int item: arr) {
            if(item==value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many items will you enter?: ");
        int n = in.nextInt();
        int[] list = new int[n];
        int[] result = new int[n];

        for(int i = 0; i<n; i++) {
            System.out.print("Enter a number: ");
            list[i] = in.nextInt();
        }
        int index = 0;
        
        for(int first = 0; first<n; first++) {
            for(int second = 0; second<n; second++) {
                if((first != second) && (list[first] == list[second])) {
                    if(!checkHasFoundAlready(result, list[first])) {
                        result[index++] = list[first];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(result));
        
        in.close();
    }
}