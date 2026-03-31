// jav aatomatically promotes each bytes,shorts or char -> int
// if one operator is long , float, double -> long, float, double
// only happen with expression 
package Basics;

// import java.util.Scanner;

public class type_promotion {
    public static void main(String args[]){
        
        short a = 900;
        byte b = 25;
        char c ='c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

        // byte b = 5;
        // byte a = (byte) (b * 2);
        // System.out.println(a);
    }
}
