public class TrappingRainwater{
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        trappingWater(height);
    }
    static void trappingWater(int height[]){
        // calculate left max boundaries -- array leftMax[]
        int n = height.length;
        int leftMax[] = new int[n];
        int waterlevel = 0;
        int trappedWater = 0;
        leftMax[0] = height[0];
        // loop for left max array 
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // printArray(leftMax);

        // calculate right max boundaries -- array rightMax[]
        int rightMax[]= new int[n];
        rightMax[n-1] = height[n-1];
        
        // loop for right max array
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        // printArray(rightMax);

        // waterlevel
        for(int i =0;i<n;i++){
            waterlevel = Math.min(leftMax[i],rightMax[i]);
            // trapped water
            trappedWater += waterlevel-height[i];
        }
        System.out.print("Total trapped water is "+trappedWater);
        
    }
    static void printArray(int arrayy[]){
        for(int i=0; i< arrayy.length;i++){
            System.out.print(arrayy[i]+"  ");
        }
    }
}