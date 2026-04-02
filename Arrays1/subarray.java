// continueous part of array
public class subarray {
    public static void subArray(int numbers[]){
        int total_subarray = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){//j=i becoz ti print single element array
                int end = j;
                for (int k=start; k<=end;k++){
                    System.out.print(numbers[k] + " ");
                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
            System.out.println("Total Subarrays =" + total_subarray);
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        subArray(numbers);
    }
}
