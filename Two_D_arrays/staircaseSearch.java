// package Two_D_arrays;

public class staircaseSearch {

    public static boolean Straircase_search(int matrix[][], int target){
        int row = 0;
        int col= matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if(matrix[row][col] == target){
                System.out.println(target + " Found at (" + row + "," + col + ")");
                return true;
            }

            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(target +" Not found !");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,19}};
        int target = 11;

        Straircase_search(matrix,target);
    }
}
