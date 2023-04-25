public class palindromeOrNot{
    public static void main(String args[]){
        String name = "racecar";
        palindromeChecker(name);
    }
    static boolean palindromeChecker(String name){
        // find the length of the string at first
        //--> our aim is to first devide the string 
        // compair first later to last later 
        // compair second later to last second later
        //....... until we reach to the middle point of the string ..
        // if we get same and reached to the middle then this string is palindrome otherwise not a palindrome string
        // here is the length of the string
        int n = name.length();
        // here is the loop to check laters
        // this loop is run from first later to middle of the string
        for(int i = 0;i<n/2;i++){
            // now let's check the laters
            if(name.charAt(i) != name.charAt(n-1-i)){
                System.out.print("This is not a palindrome string...");
                return false;
            }
        }
        System.out.print("This is a palindrome String...");
        return true;
        
    }
}