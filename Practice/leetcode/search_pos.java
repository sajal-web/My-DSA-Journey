public class search_pos{
    public static void main(String args[]){
        int arr[] = { 1,2, 3, 5, 6, 8};
        // target 5
        int target = 5;
        int start = 0;
        int mid=0;
        int end = arr.length;
        while(start < end){
             mid = (start + end) / 2;
            if(arr[mid] == target){
                System.out.print("Element found in pos : "+mid);
                return;
            }
            else if(arr[mid] > target){
                    start = mid + 1;
                }
            else   end = mid - 1;
            
        }
        

    }
}