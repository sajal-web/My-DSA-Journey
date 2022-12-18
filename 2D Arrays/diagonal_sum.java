public class diagonal_sum {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }

        };
        diagonalSumFunction(matrix);
    }

    private static void diagonalSumFunction(int[][] matrix) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum1 += matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
