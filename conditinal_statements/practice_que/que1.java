
import java.util.*;
public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0){
            System.out.println("Number is Positive");
        }
        
        else if (a < 0){
            System.out.println("Number is Negative");
        }

        else {
            System.out.println("Number is zero");
        }
    }
}
