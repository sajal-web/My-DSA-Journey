import java.util.*;
public class basicSortingAlgo{
    public static void main(String args[]){
        int arr[] = { 1,4,1,3,2,7,4,3};
        // bubbleSort(arr);
        // Arrays.sort(arr); // inbuilt sort accending
        // Arrays.sort(arr,0,3); // sort upto a specific index position of the array
        // Arrays.sort(arr,Collections.reverseOrder()); 
        // Arrays.sort(arr,0,3,Collections.reverseOrder()); we need to change all int to Integer to use this function
        // countingSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        printArray(arr);
        
    }
    static void selectionSort(int arr[]){
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
    static void countingSort(int arr[]){
        // find out the largest element from the array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        // now let's create the count array size where i can store the frequency of the elements
        int count[] = new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting logic
        int j =0;
        for(int i =0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    static void insertionSort(int arr[]){
        for(int i =1;i<arr.length;i++){
        // let's define the required variables to perfor this sorting algo
        int curr = arr[i];
        int prev = i - 1;
        // now let's check the right positon to insert the curr element
        while(prev >=0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        // put curr now in the right pos
        arr[prev+1] = curr;
        }
        
    }
}