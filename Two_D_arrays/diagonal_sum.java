// package Two_D_arrays;

public class diagonal_sum {

    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        // TC = O(n^2)
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //PD
                if(i==j){
                    sum+=matrix[i][j];
                }
                //SD
                if(i+j == matrix.length-1 && i!=j){
                    sum+=matrix[i][j];
                }
            }
        }

        // // TC = O(n)
        // for(int i=0; i<matrix.length; i++){
        //     // PD
        //     sum+= matrix[i][i];

        //     // SD
        //     // but for eleminating the the middle element adding twice codition we if condition
        //     if(i != matrix.length-1-i){
        //         sum+= matrix[matrix.length-1-i][i];
        //     }
        // }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {3,4,5},
                          {5,6,7}};

        System.out.println(diagonalSum(matrix));
    }
}
