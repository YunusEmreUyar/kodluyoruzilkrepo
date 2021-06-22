public class arrays3 {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for(int row=0;row<letter.length; row++) {
            for(int col=0;col<letter[row].length; col++) {

                if (row==0 || row==3 || row==6) {
                    letter[row][col] = " * ";
                } else if (col==0 ||col==3) {
                    letter[row][col] = " * ";
                } else {
                    letter[row][col] = "   ";
                }

            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
