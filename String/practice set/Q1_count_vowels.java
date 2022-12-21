public class Q1_count_vowels{
    public static void main(String args[]){
        String str = "aeiou";
        countVowelsFun(str);
    }
    public static void countVowelsFun(String str){
        
        int count =0;
        for(int i=0;i<str.length();i++){
          char  ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u'){
                    count++;
            }
        }
        System.out.print(count);
    }
}