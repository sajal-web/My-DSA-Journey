public class friendsPairing{
    public static void main(String args[]){
        System.out.print(friendsPairing(3));
    }
    static int friendsPairing(int n){
        if(n==1 || n ==2){
            return n;
        }
        // choise single
        // int fnm1 = friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;
        // int totalPair = fnm1 + pairWays;
        // return totalPair;
        return friendsPairing(n-1)+ (n-1) * friendsPairing(n-2);
    }
}