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


//  ************************butter-fly*********************

// public class PattenPrinting{
   
//     public static void ButterFly(int rows){
//         //upper half
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1; k<=(2*rows-2*i);k++){
//                 System.out.print(" ");
//             }
//             for(int l=1; l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         //lower half
//         for(int i=0; i<rows;i++){
//              for(int j=rows; j>i;j--){
//                 System.out.print("*");
//              }
//              for(int k=1; k<=2*i; k++){
//                 System.out.print(" ");
//              }
//              for(int l=1;l<=rows-i;l++){
//                 System.out.print("*");
//              }
//              System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//         ButterFly(4);
//     }
// }


// ********************* SOLID RHOMBUS **********************

//  public class PattenPrinting{
   
//     public static void SolidRhombus(int rows){

//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=rows-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=rows; k++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//         SolidRhombus(5);
//     }
// }



// ************************* SOLID HOLLOW RHOMBUS****************


//  public class PattenPrinting{
   
//     public static void SolidRhombus(int rows){

//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=rows-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=rows; j++){
//                 if(i==1 || i==rows || j==1 || j==rows){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.print("\n");
//         }
//     }

//     public static void main(String arg[]){
//         SolidRhombus(5);
//     }
// }


// ************************** DIAMOND PATTERN *********************************

public class PattenPrinting{
   
    public static void Diamond(int rows){
        // upper half
        for(int i=1; i<=rows; i++){
            // int x=1;
            for(int j=1; j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
                // x = x+2;
            }
            System.out.print("\n");
        }

        // lower half

         for(int i=rows; i>=1; i--){
            // int x=1;
            for(int j=1; j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
                // x = x+2;
            }
            System.out.print("\n");
        }

       

        // for(int  i=1; i<=rows;i++){
        //     for(int j=1; j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*rows+1-2*i);k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }

    public static void main(String arg[]){
        Diamond(5);
    }
}