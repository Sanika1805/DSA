import java.util.*;
public class bionomial_coe {
    public static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoef(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/ (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter the value of n:");
        int n = sc.nextInt();

        System.out.println("Eneter the value of r:");
        int r = sc.nextInt();

        int result = binCoef(n , r);
        System.out.println("Bionomial Coefficient (nCr) = " + result);
    }
}