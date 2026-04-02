// using the same array so space complexity is reduced which is O(1)
// time complexity is same = O(n)

public class reverse_array {
    public static void reverseAarray(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first < last){
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp; 

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverseAarray(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
