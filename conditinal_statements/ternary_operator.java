package conditinal_statements;
// variable = condition? statement1 : statement2;

// package conditinal_statements;

public class ternary_operator {
    public static void main(String[] args) {
       int number = 4;
       
    //even and odd by ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
