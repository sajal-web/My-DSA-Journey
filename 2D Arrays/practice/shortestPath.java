public class shortestPath{
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(checkerFunction(path));
    }
    static float checkerFunction(String path){
        // at first our starting point is x = 0, and y =0
        int x =0,y=0;
        // now if we want to go east x will be x+1
        // west --> y = y-1, north --> y+1, south --> x = x-1
        // those are the most importaint andl logical step of this type of problem
        // now let's implement the logic...
        for(int i =0;i<path.length();i++){
            char move = path.charAt(i);
            // east
            if(move == 'E'){
                x++;
            }
            // west
            else if(move == 'W'){
                x--;
            }
            //north
            else if(move == 'N'){
                y++;
            }
            // south
            else{
                y--;
            }
        }
        // NOW we got the value of x and y and let's perform the operation to get the result
       int X2 = x*x;
       int Y2 = y*y;
       float result =(float)Math.sqrt(X2+Y2);
       return result;
    }
}