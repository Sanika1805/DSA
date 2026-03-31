// keep enterning num till user enter a multiple of 10

import java.util.Scanner;

public class break_exa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter your number :");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);
    }
}
