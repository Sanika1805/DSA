package Arrays2.practice_que;

public class que2 {
    public static int return_target_index(int nums[], int target){
        int start = nums[0];
        int end = nums.length-1;
        

        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid]==target){
                return mid;
            }

            // left half is sorted
            if(nums[mid] >= nums[start]){

                // target is in left half
                if(target>=nums[start] && target<nums[mid]){
                    end = mid-1;
                }

                // target is in right half
                else{
                    start = mid+1;
                }
            }

            else{
                // right half is sorted 
                if(target>nums[mid] && target<=nums[mid]){
                    start = mid+1;
                }

                // target is in right half
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(return_target_index(nums, target));
    }
}
