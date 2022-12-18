import java.util.Scanner;

import java.util.*;

public class Q1_avg_of3_numbers {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int avg = (A + B + C) / 3;
        System.out.println("THe average of three numbers is : " + avg);
    }
}