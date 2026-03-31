package patterns2;

public class floyds_Triangle {
    public static void FloydsTriangle(int totrows){
        int counter = 1;
        int n = totrows;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        FloydsTriangle(5);
    }
}
