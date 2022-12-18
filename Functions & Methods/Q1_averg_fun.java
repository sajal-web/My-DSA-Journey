import java.util.Scanner;

import java.util.*;

public class Q1_averg_fun {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int result = avrgOfThreeNum(a, b, c);
        System.out.println(result);

    }

    static int avrgOfThreeNum(int a, int b, int c) {
        int avrg = (a + b + c) / 3;
        return avrg;

    }
}
