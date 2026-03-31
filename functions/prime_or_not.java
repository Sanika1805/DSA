// import java.util.Scanner;

// public class prime_or_not {
//     public static boolean isPrime(){
//         if (n == 2){
//             System.out.println("2 is prime number");
//         }
//         else{
//             boolean isPrime = true;
//             for(int i=1; i<=n; i++){
//                 if(n/i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if(isPrime == true){
//                 System.out.println(n + " is Prime number");
//             }

//             else{
//                 System.out.println(n + " is not Prime numbe");
//             }
//         }
//         return isPrime();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Eneter the number: ");
//         int n = sc.nextInt();

//         isPrime();

//     }
// }

// import java.util.Scanner;
public class prime_or_not {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }

}