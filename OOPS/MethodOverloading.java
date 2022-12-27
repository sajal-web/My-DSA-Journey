public class MethodOverriding{
    public static void main(String args[]){
        Calculator myC = new Calculator();
        System.out.println(myC.sum(12,23));
        System.out.println(myC.sum((float)12.3,(float)12.5));
        System.out.println(myC.sum(12,12,12));
    }
}
class Calculator{ 
    // method with integer parameaters
    int sum(int a, int b){
        return a+b;
    }
    // method overloading with different parameaters
    float sum(float a, float b){
        return a+b;
    }
    // method overloading diff cause of count
    int sum (int a, int b, int c){
        return a + b + c;
    }
}