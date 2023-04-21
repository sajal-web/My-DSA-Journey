public class diagonalSum{
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        diagonalSumLogicBrutForce(matrix);
    }
    static void diagonalSumLogicBrutForce(int matrix[][]){
        // brute force approach in this approach we check the primary diagonal : 
        // If i == j  than we only add the value into the sum which is primary diagonal sum
        // secoundary diagonal : if i+j == n-1; than we need to add this value into the sum
        // to calculate the value here we are using nested for loop to traverse the 2d array
        // Here is the code: 
        int sum =0;
        for(int i =0;i< matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                // primary diagonal sum
                if(i==j){
                    sum+= matrix[i][j];
                }
                // secoundary diagonal sum
                if(i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
        }
        System.out.print(sum);
    }
    
}