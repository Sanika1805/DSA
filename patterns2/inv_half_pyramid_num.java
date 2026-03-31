package patterns2;

public class inv_half_pyramid_num {
    public static void halfPyramidNum(int totRows, int totCols){
        int n = totRows;
        // int m = totCols;
        for(int i=1; i<=n; i++){
            // numbers
            for(int j=1; j<=n+1-i; j++){
                    System.out.print(j);   
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPyramidNum(5, 5);
    }
}
