public class subarray{
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        printSubarray(numbers);
    }
    static void printSubarray(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < numbers.length;i++){
            int start = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                int end = numbers[j];
                int sum =0;
                for(int k = start;k<end;k++){
                    sum+=numbers[k];
                    // System.out.print(numbers[k]+"  ");
                    
                    
                }
                System.out.print(sum);
                if(max<sum){
                    max = sum;
                }
                System.out.println();
            }
             System.out.println();

        }
        System.out.print("The max sum is "+max);
    }
}