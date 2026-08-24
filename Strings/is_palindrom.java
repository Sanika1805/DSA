// package Strings;

import java.util.Scanner;

public class is_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = 0;
        int j = s.length()-1;

        boolean ispalindrom = true;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                ispalindrom = false;
                break;
            }
            i++;
            j--;
        }

        if(ispalindrom){
            System.out.println("This a palindrom!");
        }
        else{
            System.out.println("this is not a palindrom!");
        }
    }
}
