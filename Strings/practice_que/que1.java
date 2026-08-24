// Count how many times lower case vowels occurred in a String entered by the use
package practice_que;

import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                count++;
            }
        }

        System.out.println("Count of lower case vowels in given String are : " + count);
    }
}
