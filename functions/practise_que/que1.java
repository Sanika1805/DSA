// package practise_que;
import java.util.*;

public class que1 {
    public static int avg(int a, int b ,int c){
    
        int avg = (a + b + c)/3;

        System.out.println("Avg of three numbers is " + avg);
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        avg(a, b, c);
    }
}
