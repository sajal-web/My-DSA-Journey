// Print the sum, difference and product of two complex number by creating a class named "complex"  with 
// Separated methods for each operations whose raal and imaginary parts are entered by the user..
import java.util.*;
class Complex1{
    int real;
    int imag;
    public Complex1(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex1 add(Complex1 a, Complex1 b){
        return new Complex1((a.real+b.real),(a.imag+b.imag));
    }
     public static Complex1 diff(Complex1 a, Complex1 b){
        return new Complex1((a.real-b.real),(a.imag-b.imag));
    }
     public static Complex1 product(Complex1 a, Complex1 b){
        return new Complex1((a.real*b.real)-(a.imag*b.imag),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printCOmplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag +"i");
        }else if(imag == 0 && real !=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }

}
public class Q1_solution{
    public static void main(String args[]){

        Complex1 c1 = new Complex1(5,5);
        Complex1 c2 = new Complex1(8,4);
        Complex1 C3 = Complex1.add(c1,c2);
        Complex1 C4 = Complex1.diff(c1,c2);
        Complex1 C5 = Complex1.product(c1,c2);
        C3.printCOmplex();
        C4.printCOmplex();
        C5.printCOmplex();






        // int real,img;
        // System.out.print("Enter real number: ");
        // Scanner sc = new Scanner(System.in);
        // real = sc.nextInt();
        // System.out.print("\nEnter imaginary number : ");
        // img = sc.nextInt();
        // Complex c = new Complex();
        // System.out.print("sum is -:"+c.sum(real,img));


    }
}
class Complex{
    int sum(int a, int b){
      return a+b;  
    }
    int diff(int a, int b){
      return a-b;  
    }
    int product(int a, int b){
      return a*b;  
    }
}