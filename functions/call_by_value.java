// import java.util.*;
// public class call_by_value {
//     public static void main(String args[]){
//         // swap - values exchange
//         int a = 5;
//         int b = 10;

//         // swap
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }

// call by values -> never passes original variable but passes its copy passed to next
// call by referance -> passes original variable and its in cpp
// import java.util.*;
public class call_by_value {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a); // if we call this in main funx then it will give original values of a and b
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        // swap - values exchange
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
