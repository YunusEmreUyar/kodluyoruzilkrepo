import java.util.Scanner;

public class Others1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int right;
        System.out.println("Select game mode: \n1=>Hard\n2=>Medium\n3=>Easy");
        int gameMode = in.nextInt();
        switch (gameMode) {
            case 1:
                right = 3;
                break;
            case 2:
                right = 5;
                break;
            case 3:
                right = 10;
                break;
            default:
                right = 10;
                break;
        }

        boolean running = true, win=false;
        int theNumber = (int) (Math.random()*100);

        while(running) {
            System.out.print("Enter a number: ");
            int selection = in.nextInt();

            if (selection <= 100 && selection>0) {
                
                if (right>0) {

                    if (selection> theNumber) {
                        System.out.println("You entered too high.");
                        right--;
                    } else if (selection == theNumber) {
                        System.out.println("You won! The number was" + theNumber);
                        running = false;
                    } else {
                        System.out.println("You entered too low.");
                        right--;
                    }
                } else {
                    System.out.println("You lost :(");
                    running = false;
                }
                


            } else {
                System.out.println("Please enter a number between 0-100.");
                right--;
                System.out.println("You have " + right + " more chances.");
            }
        
        
        }
        if (!win) {
            System.out.println("The number was: " + theNumber);
        }
        System.out.println("Thanks for playing.");
        in.close();
    }
}
