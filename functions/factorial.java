import java.util.Scanner;

public class factorial {
    public static int factorial_of_num(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int fact = factorial_of_num();
        System.out.println("Factorial is " + fact);
    }
}
