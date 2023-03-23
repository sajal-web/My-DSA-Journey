public class reverse{
    public static void main(String args[]){
        int numbers[]= {1,2,3,4,5,6,7,8,9};
        reverseTheArray(numbers);
        reverseArray(numbers);
        System.out.println();
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+"  ");
        }
    }
    // brut force method using loop
    static void reverseTheArray(int numbers[]){
        System.out.println("Using for loop...");
        for(int i = numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]+"  ");
        }
    }
    // useing swaping method
    static void reverseArray(int numbers[]){
        int start = 0,end = numbers.length-1,temp =0;
        System.out.print("\nUsing swaping method...");
        while(start<end){
        temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        start++;end--; 
        }
    }

    
}