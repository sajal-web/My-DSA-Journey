import java.util.*;
public class bill{
    public static void main(String args[]){
        float p1,p2,p3,tc,wgst;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the pen: ");
        p1 = sc.nextFloat();
        System.out.print("Enter the price of the pencil: ");
        p2 = sc.nextFloat();
        System.out.print("Enter the price of the eraser: ");
        p3 = sc.nextFloat();
        tc = p1+p2+p3;
        System.out.print("Here is your bill sir :"+tc);
         wgst = tc + (0.18f * tc);
        System.out.print("\nWith gst your bill is: "+wgst);
    
    }
}