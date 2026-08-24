package practice_que;

import java.util.Arrays;

public class que4 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // conerting to lower case , so don't have to check seprate uppercase and lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check length
        if(str1.length() == str2.length()){

            // convert to char Array
            char[] Array1 = str1.toCharArray();
            char[] Array2 = str2.toCharArray();

            // sort the characters of the array
            Arrays.sort(Array1);
            Arrays.sort(Array2);

            // check is sorted arrays are same 
            boolean isSame = Arrays.equals(Array1, Array2);

            if(isSame){
                System.out.println("String 1 and String 2 are Anagrams");
            } else{
                System.out.println("String 1 and String 2 are not Anagrams");
            }
        } else{
            System.out.println("String 1 and String 2 are not Anagrams");
        }
    }
}
