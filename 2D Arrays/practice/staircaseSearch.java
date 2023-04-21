public class staircaseSearch{
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
       System.out.print(staircaseFun(matrix,105)); 
    }
    static boolean staircaseFun(int matrix[][],int key){
        int row = 0, column = matrix[0].length-1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == key){
                System.out.print("Key found at pos "+row+", "+column+".");
                return true;

            }else if(key < matrix[row][column]){
                column--;
            }else{
                row++;
            }
        }
      System.out.print("Not found....");
      return false;
    }
}