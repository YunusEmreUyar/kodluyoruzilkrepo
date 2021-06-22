import java.util.Scanner;
import java.util.Arrays;

public class arrays2 {

    static int[] getArray() {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            System.out.print("Enter a number: ");
            arr[i] = in.nextInt();
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] numbers = getArray();
        Scanner inp = new Scanner(System.in);

        Arrays.sort(numbers);

        System.out.print("\nEnter a number to find nearest: ");
        int number = inp.nextInt();

        int distance = Math.abs(numbers[0]-number);
        int index = 0;
        
        for(int i=1; i<numbers.length; i++) {
            int dist = Math.abs(numbers[i]-number);
            if(dist<distance) {
                index = i;
                distance = dist;
            }
        }

        System.out.println(numbers[index]);
        System.out.println(Arrays.toString(numbers));
        if(number > numbers[index]) {
            System.out.println("Lower nearest is: " + numbers[index]);
            System.out.println("Higher nearest is: " + numbers[index+1]);
        } else {
            System.out.println("Lower nearest is: " + numbers[index-1]);
            System.out.println("Higher nearest is: " + numbers[index]);
        }

        inp.close();
    }    
}
