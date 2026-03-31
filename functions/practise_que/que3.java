import java.util.Scanner;

public class que3 {
    public static int isPalindrom(int o_num){
        int last_digit;
        int my_num = o_num;
        int rev_num = 0 ;
        while(o_num!=0){
            last_digit = o_num % 10;
            rev_num = rev_num * 10 + last_digit;
            o_num = o_num / 10;
        }
        if(rev_num == my_num){
            System.out.println(my_num + " is a Pallindrome!!");
         }
        else{
            System.out.println(my_num + " is not a pallindeom!!");
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number: ");
        int o_num = sc.nextInt();
        isPalindrom(o_num);
    }
}
