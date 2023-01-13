public class fibonacciNumber{
    public static void main(String args[]){
        System.out.print(printFibonacci(2));
    }
    static int printFibonacci(int n){
        if(n ==0 || n == 1){
            return n;
        }
        int fnm1 = printFibonacci(n-1);
        int fnm2 = printFibonacci(n-2);
        int fib = fnm1 + fnm2;
        return fib;
    }
}