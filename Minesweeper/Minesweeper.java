import java.util.Scanner;
import java.util.Random;

public class Minesweeper {

    boolean win = false, lose = false, gameOpen = true;
    int[][] mines;
    int[][] board; 
    /* 
        in board: 
            9 means, the cell is mined.
    */
    Minesweeper(int row, int col) {
        Random rand = new Random();

        board = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                this.board[i][j] = -1;
            }
        }
        for (int i=0; i<row*col/4; i++) {
            board[rand.nextInt(row)][rand.nextInt(col)] = 9;
        }
    }

    public void findNearest(int r, int c) {
        int counter = 0;

        if(r != 0 && c!= 0) {
            if(isMine(r-1, c-1) && isValid(r-1, c-1)) {
                counter++;
            }
            if (isMine(r-1, c) && isValid(r-1, c)) {
                counter++;
            }
            if (isMine(r-1, c+1) && isValid(r-1, c+1)) {
                counter++;
            }
            if (isMine(r, c-1) && isValid(r, c-1)) {
                counter++;
            }
            if (isMine(r, c+1) && isValid(r, c+1)) {
                counter++;
            }
            if (isMine(r+1, c-1) && isValid(r+1, c-1)) {
                counter++;
            }
            if (isMine(r+1, c) && isValid(r+1, c)) {
                counter++;
            }
            if (isMine(r+1, c+1) && isValid(r+1, c+1)) {
                counter++;
            }
        } else if (r == 0 && c != 0) {
            if (isMine(r, c-1) && isValid(r, c-1)) {
                counter++;
            }
            if (isMine(r, c+1) && isValid(r, c+1)) {
                counter++;
            }
            if (isMine(r+1, c-1) && isValid(r+1, c-1)) {
                counter++;
            }
            if (isMine(r+1, c) && isValid(r+1, c)) {
                counter++;
            }
            if (isMine(r+1, c+1) && isValid(r+1, c+1)) {
                counter++;
            }
        } else if (r!= 0 && c==0){
            if (isMine(r+1, c) && isValid(r+1, c)) {
                counter++;
            }
            if (isMine(r+1, c+1) && isValid(r+1, c+1)) {
                counter++;
            }
            if (isMine(r, c+1) && isValid(r, c+1)) {
                counter++;
            }
            if (isMine(r-1, c) && isValid(r-1, c)) {
                counter++;
            }
            if (isMine(r-1, c+1) && isValid(r-1, c+1)) {
                counter++;
            }  
        }

        this.board[r][c] = counter;
    }

    public boolean isMine(int r, int c) {
        return this.board[r][c] == 9? true: false;
    }

    public void makeMove(int r, int c) {
        
        if (isValid(r, c)) {
            if (isMine(r, c)) {
                this.gameOpen = false;
                this.lose = true;
            } else {
                findNearest(r, c);
            }
        }
    }

    public void printBoard() {
        for (int[] i: board) {
            for (int j: i) {
                /*
                if(j == 9) {
                    System.out.print(" * ");
                }
                */
                if (j == -1 || j==9) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + j + " ");
                }
            }
            System.out.println();
        }
    }

    // Check user arguments is less than board size. 
    public boolean isValid(int r, int c) {
        return (r>=0) && (r < this.board.length) && (c>=0) && (c < this.board[1].length);
    }

    public boolean checkUserWin() {
        for (int[] i: this.board) {
            for (int j: i) {
                if(j == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void run() {
        Scanner in = new Scanner(System.in);

        while(gameOpen) {
            
            printBoard();

            // Take user arguments here.
            System.out.print("Enter row: ");
            int rowSelection = in.nextInt();
            System.out.print("Enter col: ");
            int colSelection = in.nextInt();
            System.out.println("********************");

            makeMove(rowSelection, colSelection);
            if(checkUserWin()) {
                this.gameOpen = false;
                this.win = true;
            }

        }
        if(this.lose) {
            System.out.println("Game over.");
        } else {
            System.out.println("You won!");
        }
        in.close();
    }

}