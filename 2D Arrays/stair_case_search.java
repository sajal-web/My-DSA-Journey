public class stair_case_search {
    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 336;
        staircaseSearchFunction(matrix, key);
    }

    private static boolean staircaseSearchFunction(int[][] matrix, int key) {
        int row = 0, column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println(row + "  " + column);
                return true;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }

        }
        System.out.println("not found");
        return false;
    }
}
