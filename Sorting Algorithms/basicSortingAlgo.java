import java.util.*;
public class basicSortingAlgo{
    public static void main(String args[]){
        int arr[] = { 5,4,1,3,2};
        // bubbleSort(arr);
        Arrays.sort(arr); // inbuilt sort accending
        Arrays.sort(arr,0,3); // sort upto a specific index position of the array
        printArray(arr);
        
    }
    static void insertionSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }
    static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    static void bubbleSort(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}