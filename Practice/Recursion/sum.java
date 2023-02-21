public class sum{
    public static void main(String args[]){
        System.out.print(printSum(5));
    }
    static int printSum(int n){
        if(n ==1){
            return 1;
        }
       int fnm1 = printSum(n-1);
       int fn= n + fnm1;
        return fn;
    }
}