// package Two_D_arrays.Practice_que;

public class que2 {
    public static void main(String[] args) {
        int nums[][] = {{1,4,9},{1,4,3},{2,2,3}};

        int sum = 0;

        for(int j=0; j<nums[0].length; j++){
            sum += nums[1][j];
        }

        System.out.println("Sum of nums of 2nd row is : " + sum);
    }
}
