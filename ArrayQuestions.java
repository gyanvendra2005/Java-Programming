//  ****************** LARGEST NUMBER IN ARRAY*************************
// import java.util.*;
// public class ArrayQuestions{
//     public static void Largest(int arr[]){
//         int max = Integer.MIN_VALUE; 
//         for(int i=0;i<arr.length;i++){
//             if(max<arr[i]){
//                 max = arr[i];
//             }
//         }
//         System.out.print("Largest Number is : " + max);
//     }
//     public static void main(String arg[]){
//        int arr [] = {23,453,573,43,74,62,526};
//        Largest(arr);
//     }
// }


// ***************************** Reverse in array *****************************

// public class ArrayQuestions{

//     public static void Reverse(int arr[]){
//         int first=0;
//         int last=arr.length-1;
//         while(first<last){
//             int temp;
//             temp = arr[first];
//             arr[first] = arr[last];
//             arr[last] = temp;
//             first++;
//             last--;
//         }
//         for(int i=0; i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public static void main(String arg[]){
//         int arr[] = {23,453,573,43,74,62,526};
//            Reverse(arr);       
//        }
// }



//  *********************** PAIRS IN ARRAY*************************
 
//  public class ArrayQuestions {
//     public static void pairsInArray(int arr[]) {
//         for(int i=0; i<arr.length-1; i++){
//             System.out.print("The pairs are: ");
//             for(int j=i+1;j<arr.length;j++){
//                 System.out.print(  "("+arr[i]+","+arr[j]+")");
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//                 int arr[] = {2,4,6,8,10};
//                 pairsInArray(arr);
//     }
//  }


// *********************** SUB-ARRAYS********************

//  public class ArrayQuestions {
//     public static void pairsInArray(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print("The sub-arrays are: ");
//             for(int j=i;j<arr.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print( arr[k]+",");
//                 }
//                  System.out.print("\n");
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//                 int arr[] = {2,4,6,8,10};
//                 pairsInArray(arr);
//     }
//  }



//  ******************************* MAX-SUBARRAY SUM******************************

//  public class ArrayQuestions {
//     public static void pairsInArray(int arr[]) {
//         int max = 0;
//         int sum = 0;
//        for(int i=0; i<arr.length; i++){
//             // System.out.print("The max-sub-arrays are: ");
//             for(int j=i;j<arr.length;j++){
//                 sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum = sum + arr[k];
//                 }
//                 System.out.print("\n");
//                  System.out.print(sum);
//                  if(max<sum){
//                     max = sum;
//                  }
//             }
            
//             System.out.print("\n");
          
//         }
//           System.out.print(max);
        
//     }

//     public static void main(String arg[]){
//                 int arr[] = {2,4,6,8,10};
//                 pairsInArray(arr);
//     }
//  }