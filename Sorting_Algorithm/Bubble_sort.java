// import java.util.*;

// public class Bubble_sort {
//     public static void Bubble_sort(int arr[]){
//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j=0; j<arr.length-1-turn; j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2};
//         Bubble_sort(arr);
//         printArr(arr);
//     }
// }


// for the best case means already sorted array - Time complexity- O(n^2)
// we can stop the loops by following 

import java.util.*;

public class Bubble_sort {
    public static void BubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap_count = 0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap_count ++;
                }

                if(swap_count == 0){
                    break;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        BubbleSort(arr);
        printArr(arr);
    }
}
