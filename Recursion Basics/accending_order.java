public class accending_order{
    public static void main(String args[]){
        printAccending(10);
    }
    public  static void printAccending(int n){
        if(n == 1){
            System.out.print(1+"    ");
            return;
        }
        printAccending(n-1);
        System.out.print(n+"    ");
    }
}