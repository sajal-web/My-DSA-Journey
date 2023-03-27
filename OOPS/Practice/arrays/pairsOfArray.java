public class pairsOfArray{
    public static void main(String args[]){
        int numbers[] = { 1,2,3,4,5,6,7,8,9};
        printSubarray(numbers);
    }
    static void printSubarray(int numbers[]){
        for(int i = 0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("("+curr +" , "+ numbers[j]+")");
            }
            System.out.println();
        }
    }
}
// total number of pair is A.P --> n(n-1)/2; arithmatic progress