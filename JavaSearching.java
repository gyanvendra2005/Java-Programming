// ******************************* LINEAR SEARCH *************************

// public class JavaSearching{
//     public static int Linear(int arr[], int search){
//         int flag = 1;
//         for(int i=0;i<arr.length;i++){
//             if(search==arr[i]){
//                 System.out.print("Element is found at index: " + i);
//                 flag =1;
//                 break;
//             }
//             flag =0;
//         } 
//         return flag;  
//     }

//     public static void main(String arg[]){
//         int arr[] = {1,4,26,45,67,34};
//         int search = 69;
//         int ans = Linear(arr, search);
//         if(ans==0){
//             System.out.print("element not found");
//         }
//     }
// }   


// ********************************** BINARY SEARCH ********************************

public class JavaSearching{
    public static int Binary(int arr[], int search){
        int first =0 ;
        int last = arr.length-1;
        int flag=0;
        while(first<=last){
            int mid = (last+first)/2;
            if(arr[mid]>search){
                last = mid-1; 
            }
            else if(arr[mid]<search){
                first = mid+1;
            }
            else if(arr[mid]==search){
                System.out.print("Element is found at index: "+ mid);
                flag = 1;
                break;

            }
        }
        return flag;
        
    }
    public static void main(String arg[]){
        int arr[]= {10,14,17,22,27,34};
        int search = 22;
        int ans = Binary(arr,search);
        if(ans==0){
            System.out.print("Element not Found");
        }
    }
}