import java.util.*;

public class n_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;

        while (counter <= num){
            System.out.println(counter);
            counter ++;
        }
    }
}
