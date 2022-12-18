public class Q2_sum_row {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        int row = 1;
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[row][j];
        }
        System.out.println(sum);
    }
}
