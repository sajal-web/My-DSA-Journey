import java.util.*;
public class creation{
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        printArray(matrix);
       System.out.print( searchElement(matrix,5));

    }
    static void printArray(int matrix[][]){
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
              System.out.print(matrix[i][j]+"  ");  
            }
            System.out.println();
        }
    }
    static int searchElement(int matrix[][],int key){
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    return matrix[i][j];
                }
            }
        }
        return 0;
    }
}