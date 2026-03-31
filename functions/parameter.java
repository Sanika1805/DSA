//  package functions;
import java.util.*;
// public class parameter {
//     public static void calculatesum(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("Sum is " + sum);
//     }
//     public static void main(String[] args) {
//         calculatesum();
//     }
// }

// or
// public class parameter {
//     public static void calculatesum(int a, int b){
//         int sum = a + b;
//         System.out.println("Sum is " + sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calculatesum(a, b);
//     }
// }


// scope 

public class parameter {
    public static int calculatesum(int a, int b){ //parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b); //arguments or actual parameters 
        // this sum is diff from previous as it is in diff funx
        System.out.println("Sum is " + sum);
    }
}
