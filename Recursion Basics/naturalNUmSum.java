public class naturalNUmSum{
    public static void main(String args[]){
        System.out.print(calculateSum(5));
    }
    static int calculateSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1= calculateSum(n-1);
        int sum = n + snm1;
        return sum;
    }
}