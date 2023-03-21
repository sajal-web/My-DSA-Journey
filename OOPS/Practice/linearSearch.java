public class linearSearch{
    static int linearSearchFunction(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 9;
        System.out.print(linearSearchFunction(arr,key));
    }
}
