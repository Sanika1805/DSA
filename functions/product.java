import java.util.*;
public class product {
    public static int multiply(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        // int a = 3;
        // int b = 5;
        int prod = multiply();
        System.out.println("product is " + prod);
    }
}
