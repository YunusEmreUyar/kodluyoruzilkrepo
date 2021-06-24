import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter row and column size: ");
        int rSize = in.nextInt();
        int cSize = in.nextInt();
        
        Minesweeper mine = new Minesweeper(rSize,cSize);
        mine.run();
        
        in.close();
    }
}
