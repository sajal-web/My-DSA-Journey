import java.util.*;
public class largest{
    public static void main(String args[]){
        int largest = Integer.MIN_VALUE;
        int numbers[]= {2,4,6,8,10,4,7,1,9};
        for(int i =0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        System.out.print(largest);
    }
}