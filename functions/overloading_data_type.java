// func overloading using data types

import java.util.Scanner;

public class overloading_data_type {
    public static int sum(int a, int b){
        return a + b;
    }

    // func to calc sum of two numbers
    public static float sum(float a, float b ){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two integers is: "+sum(a,b));

        System.out.println("Eneter the three numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        System.out.println("Sum of two float is: "+sum(x, y));
    }
}
