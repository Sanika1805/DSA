package patterns2;

public class inv_rot_half_Pyramid {
    public static void half_pyramid(int totRows, int totCols){
        int num_lines = totRows;
        for(int i=1; i<=num_lines; i++){
            // spaces
            for(int j=1; j<=num_lines-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        half_pyramid(4, 4);
    }
}
