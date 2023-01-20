public class firstOcurrence{
    public static void main(String args[]){
            int arr[]={3,4,6,7};
            int key = 5;

            System.out.print(getFirstOcurrence(arr,key,0));
    }
    static int getFirstOcurrence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return getFirstOcurrence(arr,key,i+1);
    }
}