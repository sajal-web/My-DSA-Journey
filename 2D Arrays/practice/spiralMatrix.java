public class spiralMatrix{
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        sprialMatrixPrintFun(matrix);
    }
  static void sprialMatrixPrintFun(int matrix[][]){
        // first declare the all necessary variables
        int startingRow =0, startingCol=0, endingRow = matrix.length-1, endingCol = matrix[0].length-1;
        // Here is the base condition for the problem
        while(startingCol <= endingCol && startingRow <= endingRow){
            // Now let's print the upperrow of the matrix
            // here constant is startingrow and variable is column
            // here is the loop
            for(int j = startingCol; j<= endingCol; j++ ){
                System.out.print(matrix[startingRow][j]+"   ");
            }

            // Now let's print the right column of the matrix
            // here constant is endingColumn and variable is Row
            // here is the loop
            for(int i = startingRow+1; i<= endingRow; i++){
                System.out.print(matrix[i][endingCol]+"  ");
            }

            // Now let's print the bottom row of the matrix
            // here the constant is endingRow and variable is column
            // here is the loop
            for(int j = endingCol-1; j>= startingCol; j--){
                if(startingRow== endingRow){
                    break;
                }
                System.out.print(matrix[endingRow][j]+"  ");
            }
            // Now let's print the left column of the matrix
            // here the constant is startingColumn and the variable is row
            // here is the loop
            for(int i = endingRow-1; i>= startingRow+1; i--){
                if(startingCol == endingCol){
                    break;
                }
                System.out.print(matrix[i][startingCol]+"  ");
            }
            // Now let's update the variables 
            startingCol++;startingRow++;endingRow--;endingCol--;
           
        }

        System.out.println();
    }
}