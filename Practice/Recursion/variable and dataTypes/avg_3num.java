import java.util.*;
public class avg_3num{
    public static void main(String args[]){
        int a, b, c, avgVal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("\nEnter the value of b: ");
        b = sc.nextInt();
        System.out.print("\nEnter the value of c: ");
        c = sc.nextInt();

        avgVal = (a + b + c)/3;
        System.out.print("The average of those number is : "+avgVal);
    }
}