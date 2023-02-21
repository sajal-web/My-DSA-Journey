public class decrease{
    public static void main(String args[]){
        printNum(10);
    }
    static void printNum(int n){
        //base case
        if(n==1){
            System.out.print(1+"  ");
            return;
        }

        System.out.print(n+"  ");
        printNum(n-1);
    }
}