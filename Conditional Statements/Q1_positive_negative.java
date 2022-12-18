import java.util.Scanner;

public class Q1_positive_negative {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("THis is positive number");
        }
    }
}
