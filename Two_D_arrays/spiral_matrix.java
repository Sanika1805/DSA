// package Two_D_arrays;

public class spiral_matrix {
    public static void SpiralMatrix(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){

            // TOP
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }

            // RIGHT
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // BOTTOM
            // Only if bottom row is different from top row
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
            }

            // LEFT
            // Only if left column is different from right column
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
            }

            // // top
            // for(int j=startcol; j<=endcol; j++){
            //     System.out.print(matrix[startrow][j]+" ");
            // }

            // // right
            // for(int i=startrow+1; i<=endrow; i++){
            //     System.out.print(matrix[i][endcol]+" ");
            // }

            // // bottom
            //     for(int j=endcol-1; j>=startcol; j--){
            //         if(startrow == endrow){
            //             break;
            //         }
            //         System.out.print(matrix[endrow][j]+" ");
            //     }

            // // left
            // if(startcol == endcol){
            //     for(int i=endrow-1; i>=startrow; i--){
            //         // if(startcol == endcol){
            //         //     break;
            //         // }
            //         System.out.print(matrix[i][startcol]+" ");
            //     }
            // }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String arg[]){
        int matrix[][] = {{1,2},
                          {3,4},
                          {5,6},
                          {7,8}};
        SpiralMatrix(matrix);
    }
}
