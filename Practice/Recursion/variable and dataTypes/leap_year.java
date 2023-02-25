public class leap_year{
    public static void main(String args[]){
        int year = 1700;
        // if(year % 4 ==0 ){
        //     if(year % 100 == 0){
        //         if(year % 4 == 0){
        //             System.out.print("The year is a leap year...");
        //         }else{
        //             System.out.print("Not a leap year");
        //         }
        //     }
        //     else{
        //         System.out.print("Leap year..");
        //     }
        // }else{
        //     System.out.print("Not a leap year");
        // }
        boolean x = (year % 4 )== 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100  == 0) && (year % 400== 0));

        if(x && (y  || z)){
            System.out.print("Leap year");
        }else{
            System.out.print("Not a leap year");
        }

    }
}