public class lastOccurrence{
    public static void main(String args[]){
        int arr[]={12,22,44,22,55,66,33};
        int key = 22;
        System.out.print(getLastOccurrence(arr,key,0));
    }
    static int getLastOccurrence(int arr[],int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }
        // System.out.print("before"+i+"  ");
       int isFound = getLastOccurrence(arr,key,i+1);
    //    System.out.print(i+"    ");
       if(isFound == -1 && arr[i]==key){
           return i ;
       }
        // if(isFound != -1){
        //     return isFound;
        // }
        // // now let's checkself
        // if(arr[i]==key){
        //     return i;
        // }
        return isFound;
    }
}