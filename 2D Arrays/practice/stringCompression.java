public class stringCompression{
    public static void main(String args[]){
        String str = "aabbbbbcccccddddddd";
        stringCompFunction(str);
    }
    static void stringCompFunction(String str){
        // our aim is to compress the string
        // first let's create a stringbuilder to store the final string
        StringBuilder sb = new StringBuilder("");
        int count = 1; // this is for count the similar latter in the string
        // now let's traverse the string using a loop
        for(int i = 0;i<str.length();i++){
            count = 1;
            // now let's check the first  latter is avilable in the string how many times...
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
            System.out.print(sb);
    }
}