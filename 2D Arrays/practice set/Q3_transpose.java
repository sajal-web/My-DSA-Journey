public class Q3_transpose {
    public static void main(String[] args) {
        int matrix[][] = {
                { 11, 12, 13 },
                { 21, 22, 23 }
        };
        int transpose[][] = new int[3][2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
