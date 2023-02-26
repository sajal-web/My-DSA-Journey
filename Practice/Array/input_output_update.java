import java.util.*;
public class input_output_update{
    public static void main(String args[]){
        int numbers[] = new int[5]; // array creation and memory allocation
        // input
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}