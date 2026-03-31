import java.util.Scanner;

public class que5 {
    public static int sum(int num){
        int sum = 0;
        int last_digit;
        while(num!=0){
            last_digit = num % 10;
            sum = sum + last_digit;
            num = num /10;
        }

        System.out.println("The sum of the digits in a number is :" + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = sum(num);
    }
}
