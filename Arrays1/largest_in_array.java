import java.util.*;
public class largest_in_array {
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE; //-infinity 

        for(int i=0; i<numbers.length; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 5, 6, 4};

        System.out.println("Largest value in Array is :" + getLargest(numbers));
    }
}
