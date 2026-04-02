import java.util.Scanner;
import java.util.Arrays;

public class pairs_in_array {
    public static void pair(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr +","+ numbers[j] +")" );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get array size
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        // initialize array
        System.out.println("Enetr the elments in array :");
        int[] numbers = new int[size];

        // fill the array using loop
        for(int k=0; k<size; k++){
            numbers[k] = sc.nextInt();
        }

        // display array
        System.out.println("Array enter by you is : " + Arrays.toString(numbers));
        // Arrays.toString(numbers)) -> used to return human redadable string representaion of array

        // // sorting the enter array
        // System.out.println(Arrays.sort(numbers));

        pair(numbers);
    }
}
