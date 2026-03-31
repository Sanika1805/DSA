package patterns2;

public class Butterfly {
    public static void BP(int n){
        // First half
        for(int i=1; i<=n; i++){
            // starts
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // starts
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for(int i=n; i>=1; i--){
            // starts
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // starts
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        BP(4);
    }
}
