import java.util.*;

public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 != 0){
            System.out.println("Not a leap year");
        }

        else {
            if (year % 100 != 0){
                System.out.println("This is a leap year");
            }

            else {
                if (year % 400 != 0){
                    System.out.println("Not a leap year");
                }

                else {
                    System.out.println("This is a leap year");
                }
            }
        }
     }
}

