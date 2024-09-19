// WAP TO PRINT     *
//                  **
//                  ***
//                  ****


/*   import java.util.*;
public class PattenPrinting{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ROWS:");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.print("\n");
        }
   }
}  */


// WAP TO PRINT     ****
//                  ***
//                  **
//                  *

// import java.util.*;
// public class PattenPrinting{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("ENTER NUMBER OF ROWS:");
//         int x = sc.nextInt();
//         // for(int i=1;i<=x;i++){
//         //     for(int j=x; j>=i; j--){
//         //         System.out.print("*");
//         //     }
//         //      System.out.print("\n");
//         // }
//         for(int i=x;i>=1;i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//              System.out.print("\n");
//         }
//    }
// }


//  *************************WAP TO PRINT HOLLOW RECTANGLE PATTERN************************ 

// public class PattenPrinting{
//      public static void Hollow(int rows , int colm){
//         //OuterLoop Rows
//         for(int i=1; i<=rows; i++){
//             //InnerLoop Colomns
//             for(int j=1; j<=colm; j++){
//                 if(i==1 || i==rows || j==1 || j==colm){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.print("\n");
//         }

//      }
//      public static void main(String arg[]){
//                    Hollow(4, 10);
//      }
// }



//******************************* INVERTED AND ROTATED HALF-PYRAMID **************************

// public class PattenPrinting{
//     public static void pyramid(int rows){
//         // OuterLoop
//         for(int i =1;i<=rows;i++){
//             // spaces
//             for(int j=1; j<=rows-i; j++){
//                 System.out.print(" ");
//             }
//             // stars
//             for(int k=1; k<=i;k++){
//                 System.out.print("*");
//                 }
//                 System.out.print("\n");
//         }
//     }
//     public static void main(String arg[]){
//             pyramid(4);
//     }
// }


// ***************************INVERTED HALF PYRAMIDS IN NUMBERS*********************************

// public class PattenPrinting{
   
//     public static void pyramid(int rows){
//         for(int i=0; i<rows; i++){
//             for(int j=1; j<=rows-i;j++){
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//         pyramid(5);
//     }
// }


// **************************Flod's triangle*******************

// public class PattenPrinting{
   
//     public static void flods(int rows){
//         int k = 1;
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print(k + " ");
//                 k++;
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//         flods(5);
//     }
// }


// ********************** 0-1 triangle **********************

//  public class PattenPrinting{
   
//     public static void ZeroOnetri(int rows){
//         // boolean k = true;
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=i;j++){
//                 if((i+j)%2!=0){
                    
//                     System.out.print(0);
//                 }
//                 else{
//                     // k = false;
//                     System.out.print(1);
//                 }
//                 // k = !k;
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//         ZeroOnetri(5);
//     }
// }
