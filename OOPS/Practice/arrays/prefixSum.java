public class prefixSum{
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        int maxSum = Integer.MIN_VALUE;
        // prefix array
        for(int i= 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        // for(int i=0;i<prefix.length;i++){
        //     System.out.print(prefix[i]+"  ");
        // }
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                int currSum = start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.print(maxSum);
    } 
    

}