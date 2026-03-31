// maths functions usecases
public class que4 {
    public static void main(String[] args) {
        // Math.min(x, y)
        System.out.println(Math.min(10, 20)); // Output: 10
        System.out.println(Math.min(5.5, 2.1)); // Output: 2.1

        // Math.max(x, y)
        System.out.println(Math.max(10, 20)); // Output: 20
        System.out.println(Math.max(5.5, 2.1)); // Output: 5.5

        // Math.sqrt(x)
        System.out.println(Math.sqrt(64)); // Output: 8.0
        System.out.println(Math.sqrt(16)); // Output: 4.0

        // Math.pow(base, exponent)
        System.out.println(Math.pow(2, 3)); // Output: 8.0 (2*2*2)
        System.out.println(Math.pow(5, 2)); // Output: 25.0

        // Math.abs(x) -> Returns the absolute (positive) value of a number. It is overloaded for int, long, float, and double.
        System.out.println(Math.abs(-4.6)); //Output: 4.6
        System.out.println(Math.abs(10)); //Output: 10

        // Math.avg
        // Example of how to calculate the average of three numbers manually
        double num1 = 10, num2 = 20, num3 = 30;
        double average = (num1 + num2 + num3) / 3.0; // Use 3.0 for double division
        System.out.println("The average is: " + average); // Output: The average is: 20.0
    }
}
