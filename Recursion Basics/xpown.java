public class xpown{
    public static void main(String args[]){
        System.out.print(power(2,10));
    }
    public static int power(int x,int n){
        if(n ==0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }
}