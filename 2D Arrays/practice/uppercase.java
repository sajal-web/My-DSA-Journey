public class uppercase{
    public static void main(String args[]){
        String str = "Hey, there welcome to the world of JAVA";
        toUppercaseFun(str);
        
    }
    static void toUppercaseFun(String str){
        // Let's create the stringbuilder to store the new string 
        StringBuilder sb = new StringBuilder("");
        // First latter need to be uppercase
        sb.append(str.toUpperCase().charAt(0));
        // now let's go through a loop , and check where the blank space is available, where the blank space is
        // available after the blank space i change the latter to uppercase 
        for(int i =1; i< str.length();i++){
            // check the blank space 
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(str.toUpperCase().charAt(i));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb);
    }
}