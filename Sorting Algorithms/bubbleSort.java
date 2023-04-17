public class bubbleSort{
    public static void main(String args[]){
        int arr[] = { 5,3,4,2,1};
        sortingFunction(arr);
        
    }
    static void sortingFunction(int arr[]){
        for(int turns = 0;turns<arr.length-1;turns++){
            for(int j = 0;j<arr.length-1-turns;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}