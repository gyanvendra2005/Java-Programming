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