// can convert int -> long not long -> int
// byte -> short -> int -> floate -> long -> double
//conversion happen when a) type compatible  b) destination type > source type 
// widening conersion 
// losssy conversion -> destination type < source type
package Basics;
import java.util.*;
public class type_conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // (error)
        Float number1 = sc.nextFloat();
        System.out.println(number);
        System.out.println(number1);
    }
}
