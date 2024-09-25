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


//  ************************ TRAPPING RAINWATER ***********************

import java.util.*;
public class ArrayQuestions{
    public static int WaterHeight(int arr[]){
        // max in left side
         int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0]=arr[0];
        for(int i=1; i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1] , arr[i]);
        }
        // max in right side
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],arr[i]);
        }
        // min of rightmax and leftmax
        int waterlevel;
        int trappedwater =0;
        for(int i=0;i<n;i++){
            waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - arr[i]; 
        }
        // water trapped
        // int trappedwater =0;
        // for(int i=0)
        return trappedwater;
    }
    public static void main(String args[]){
          int arr[] = {4,2,0,6,3,2,5};
          int ans = WaterHeight(arr);
          System.out.print(ans);
    }
}