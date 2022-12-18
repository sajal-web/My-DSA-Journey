public class spiral_matrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },

                { 11, 12, 13, 14 }
        };
        printSpiralMatrix(matrix);

    }

    static void printSpiralMatrix(int matrix[][]) {
        int startRow = 0, startColumn = 0, endRow = matrix.length - 1, endColumn = matrix[0].length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            // top
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + "  ");
            }
            // left
            for (int i = startRow + 1; i <= endRow; i++) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][endColumn] + "  ");
            }
            // bottom
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + "  ");
            }
            // right
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                System.out.print(matrix[j][startColumn] + "  ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }
}
