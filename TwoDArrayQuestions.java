// ***********************SPIRAL MATRIX***********************

// import java.util.*;
// public class TwoDArrayQuestionsjava{

//     public static void spiralMatrix(int arr[][]){
//         int startRow =0; int lastRow = 3;
//         int startColumn = 0; int lastColumn = 3;

//         while(startRow<lastRow){
//             // top row
//             for(int i=startColumn;i<lastColumn;i++){
//                 System.out.print( arr[startRow][i]+" ");
//             }
//             // System.out.println();
//             // last column
//             for(int j=startRow;j<lastRow;j++){
//                 System.out.print(arr[j][lastColumn]+" ");
//             }
//             // System.out.println();
//             // last row
//             for(int k=lastColumn;k>startColumn;k--){
//                 System.out.print(arr[lastRow][k]+" ");
//             }
//             // System.out.println();
//             // starting column
//             for(int l=lastRow;l>startRow;l--){
//                 System.out.print(arr[l][startColumn]+" ");
//             }
//             System.out.println();
//             startColumn++;
//             startRow++;
//             lastColumn--;
//             lastRow--;
//         }
        
//     }

//     public static void main(String[] args){
//         int arr[][] = new int[4][4];
//         Scanner sc = new Scanner(System.in);
//         for(int i =0;i<4;i++){
//             for(int j=0;j<4;j++){
//                System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " : ");
//                arr[i][j] = sc.nextInt(); 
//             }
//         }
//         spiralMatrix(arr);
//     }
// }


//**************************DIAGONAL SUM**************************

// import java.util.*;
// public class TwoDArrayQuestionsjava{

//     public static void DiagonalSum(int arr[][]){
//         int lastColumn = 3;
//         int mainDiagonal =0;
//         int secondDiagonal = 0;
//         // time complecity of this is O(n^2)
//         // for(int i=0;i<4;i++){
//         //     for(int j=0;j<4;j++){
//         //         if(i==j){
//         //             mainDiagonal += arr[i][j];
//         //             secondDiagonal += arr[i][lastColumn];
//         //             lastColumn--;
//         //         }
//         // }}
//         // better way and its time compexcity is O(n)
//         for(int i=0;i<4;i++){
//             mainDiagonal+=arr[i][i];
//             if(i!=lastColumn){
//                 secondDiagonal+=arr[i][lastColumn];
//             }
//         }

//         System.out.println("The sum main Diagonal is: "+mainDiagonal);
//         System.out.println("The sum second Diagonal is: "+secondDiagonal);
//     }

//     public static void main(String arg[]){
//         int arr[][] = new int[4][4];
//         Scanner sc = new Scanner(System.in);
//         for(int i =0;i<4;i++){
//             for(int j=0;j<4;j++){
//                System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " : ");
//                arr[i][j] = sc.nextInt(); 
//             }
//         }
    
//         DiagonalSum(arr);

//     }
// }

// ***************************SEARCH IN SORTED MATRIX*********************

import java.util.*;
public class TwoDArrayQuestionsjava{

     public static void stairSearch(int arr[][], int search){
        // FIRST APPROACH TIME COMPLEXCITY (M+N)
        // int row = 0;
        // int column = 3;  
        // while(row<arr.length && column>=0){
        //     if(search==arr[row][column]){
        //         System.out.print("Element found at:" +row+","+column);
        //         break;
        //     }
        //     else if(search<arr[row][column]){
        //         column--;
        //     }
        //     else if(search>arr[row][column]){
        //         row++;
        //     }
        //     else{
        //         System.out.print("Element not found");
        //     }
        // }

        // SECOND APPROACH TIME COMPLEXCITY (M+N)
   
        int row = 3;
        int column=0;
        while(row>=0 && column<arr.length){
            if(search==arr[row][column]){
                System.out.print("Element found at:" +row+","+column);
                break;
            }
            else if(search<arr[row][column]){
                column++;
            }
            else if(search>arr[row][column]){
                row--;
            }
            else{
                System.out.print("Element not found");
            }
        }}

     public static void main(String arg[]) { 
       
        int arr[][]= {{10,20,30,40},
                      {15,20,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};
        
        int search = 30;

        stairSearch(arr,search);

    }
}
