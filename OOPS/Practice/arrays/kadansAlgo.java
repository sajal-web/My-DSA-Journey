public class kadansAlgo{
    public static void main(String args[]){
        int numbers[] ={1,2,3,4,5,6,7,8,9};
       
    }
    static void kadansAlgoFun(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.print(maxSum);
    }
}