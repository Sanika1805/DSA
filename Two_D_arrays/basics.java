package Two_D_arrays;
import  java.util.*;
public class basics {
    public static void twoDArray(int arr[][], int n, int m){
        //creating array
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int arr[][],int n, int m, int k) {
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == k){
                    System.out.println("found at cell (" + i +"," + j +")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;
        int k = 6;
        twoDArray(arr, n, m);
        search(arr, n, m, k);
    }
}
