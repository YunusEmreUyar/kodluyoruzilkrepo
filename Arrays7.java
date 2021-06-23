public class Arrays7 {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };

        int[][] transposed = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("Originam matrix: ");
        for (int[] i: matrix) {
            for (int j : i) {
                System.out.println(j+ "    ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Transposed matrix: ");
        for (int[] i: transposed) {
            for (int j : i) {
                System.out.println(j+ "    ");
            }
            System.out.println();
        }
    }
}