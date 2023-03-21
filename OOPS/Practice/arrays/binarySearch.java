public class binarySearch{
    public static void main(String args[]){
        int numbers[] = {3,5,7,8,12,23};
        int key = 1;
        System.out.print(search(numbers,key));
    }
    static int search(int numbers[], int key){
        int start = 0,end = numbers.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }
        return -1;
    }
}