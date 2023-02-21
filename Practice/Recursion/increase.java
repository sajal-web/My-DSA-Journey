public class increase{
    public static void main(String args[]){
            printIncrease(12);
    }
    static void printIncrease(int n){
        if(n ==1){
            System.out.print(n+" ");
            return;
        }
        printIncrease(n-1);
        System.out.print(n+" ");
    }
}