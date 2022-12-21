import java.util.Arrays;

public class Q2_anagram_checker {
    public static void main(String args[]) {
        String str1 = "race", str2 = "care";
        anagramCheckerFun(str1, str2);

    }

    public static void anagramCheckerFun(String str1, String str2) {
        // convert strings to lowercase , why?- so that we don't have to check saparetly
        // for lower and uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Now let's check if the length of those arrays are same or not
        if (str1.length() == str2.length()) {
            // Now convert string to char array
            char[] str1Chararray = str1.toCharArray();
            char[] str2Chararray = str2.toCharArray();
            // now sort the chararray
            Arrays.sort(str1Chararray);
            Arrays.sort(str2Chararray);
            // if the sorted array are same or identical than the string is anagram
            boolean result = Arrays.equals(str1Chararray, str2Chararray);
            if (result) {
                System.out.print("Those strings are anagram");
            } else {
                System.out.print("Those string are not anagram");
            }
        } else {
            System.out.print("Those string are not anagram");
        }
    }
}