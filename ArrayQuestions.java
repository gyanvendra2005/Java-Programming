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

public class ArrayQuestions{

    public static void Reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String arg[]){
        int arr[] = {23,453,573,43,74,62,526};
           Reverse(arr);       
       }
}