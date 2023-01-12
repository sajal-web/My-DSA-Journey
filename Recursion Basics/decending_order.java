public class decending_order{
    public static void main(String args[]){
        printDecending(10);
    }
    public static void printDecending(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+"     ");
        printDecending(n-1);
    }
}