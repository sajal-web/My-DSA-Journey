public class factorial{
    public static void main(String args[]){
         System.out.print(factorialCal(5)+"  ");
    }
    static int factorialCal(int n){
        if(n == 0){
            return 1;
        }
     int fnm1 =   factorialCal(n-1);
     int fact = n * factorialCal(n-1);
        return fact;

    }
}