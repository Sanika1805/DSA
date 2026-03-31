package patterns2;

public class Triangle_01 {
    public static void Triangle(int totRows, int totCols){
        int n = totRows;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle(5, 5);
    }
}
