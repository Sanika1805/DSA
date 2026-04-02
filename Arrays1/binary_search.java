// prerequisite - sorted array -> increasing array or decreasing array
// Time complexity -> for each iteration array size will reduce by half (n/2^0 -> for first iteration)
// n/2^k = 1 -> kth iteration
// n = 2^k 
// k = log(base 2) n
// TC -> O(log n)
// binary search time complexity is always less than a linear search 

public class binary_search {
    public static int binarySearch(int numbers[], int key){
        int start = 0; int end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;
            
            // comparisons
            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid] < key){ //right
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        System.out.println("Index key is : " + binarySearch(numbers, key));
    }
}
