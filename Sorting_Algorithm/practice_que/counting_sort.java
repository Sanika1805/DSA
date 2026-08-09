import java.util.Arrays;

public class counting_sort {
    public static void countingSort(int arr[]){
        // finding range by largest number
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // finding freq/count by creating Auxillary array count[]
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // sorting the count array in the original one
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
