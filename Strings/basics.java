import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Hi , I am Sanika! ❤️";
        System.out.println(s);

        // entire line will print
        String t = sc.nextLine();
        System.out.println(t);

        // only first word will print
        String p = sc.next();
        System.out.println(p);
    }
}
