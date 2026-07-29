// // In an int array nums, return true if any value appears at least twice in the array and return false if every element is distinct
// package Arrays2.practice_que;

// // (O(n^2))
// public class que1 {
//     public static boolean twice_ele(int nums[]){
//         for(int i=0; i<nums.length-1; i++){
//             for(int k=i+1; k<nums.length; k++){
//                 if(nums[i] == nums[k]){
//                     return true;
//                 }
//              }
//         }
//         return false;
//     }
    
//     public static void main(String[] args) {
//         int nums[] = {5, 2, 4, 4, 6};
//         System.out.println(twice_ele(nums));
//     }
// }


// O(n log(n))
package Arrays2.practice_que;

import java.util.Arrays;

public class que1{
    public static int duplicate_num(int nums[]){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        System.out.println(duplicate_num(nums));
    }
}
