// multiple funx with same name but diff parameters
// in this no relation with return type like int, float in funx defination line
// so in func overlodding is depend on parameters not retun type 
// using parameters

import java.util.Scanner;

// func to calc sum of two numbers
public class funx_overloading {
    public static int sum(int a, int b){
        return a + b;
    }

    // func to calc sum of two numbers
    public static int sum(int a, int b, int c ){
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two numbers is: "+sum(a,b));

        System.out.println("Eneter the three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt(); 
        System.out.println("Sum of three numbers is: "+sum(x, y, z));
    }
}
