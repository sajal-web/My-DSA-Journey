public class tillingProblem{
    public static void main(String args[]){
        System.out.print(tillingCalculation(4));
    }
    static int tillingCalculation(int n){
        if(n ==0 || n ==1){
                return 1;
        }
        // vertical tilling
        int fnm1 = tillingCalculation(n-1);
        // horizontal tilling
        int fnm2 = tillingCalculation(n-2);
        return fnm1+fnm2;
    }
}