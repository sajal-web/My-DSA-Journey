import java.util.*;
public class area_squre{
    public static void main(String args[]){
        int side;
        int area;
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        area = side * side;
        System.out.print("THe area of the square is : "+area);
    }
}