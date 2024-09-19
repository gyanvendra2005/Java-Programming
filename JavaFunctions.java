//  ******************************** WAP TO FIND PRODUCT OF TWO NUMBERS ***************************
 
 
//  import java.util.*;

//  public class JavaFunctions{

//     public static int product(int a, int b){
//         int sum = a*b;
//         return sum;
//     }


//     public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("enter first number:");
//            int a = sc.nextInt();
//            System.out.print("enter second number:");
//            int b = sc.nextInt();
//            int product = product(a ,b );
//            System.out.print("product of the numbers is:" + product);

//     }

//  }


//    ******************************* WAP TO PRINT ALL PRIME NUMBERS IN A RANGE ******************************

// import java.util.*;
// public class JavaFunctions{

    // public static void PrimeRange(int a){
    //     for(int i=3; i<=a; i+=2){
    //         boolean prime = true;
    //         for(int j=2 ; j<i; j++){
    //             if(i%j==0){
    //             //   System.out.print(i); 
    //                 // break;
    //                 prime = false;
    //             }
    //             if(prime){
    //                 System.out.print(i);
    //             }
    //         }
    //         System.out.print("\n");
    //     }
    // }
//    public static void PrimeRange(int a) {
//     if (a >= 2) {
//         System.out.println("Prime numbers up to " + a + ":");
//         System.out.print(2); // 2 is the first prime number

//         for (int i = 3; i <= a; i += 2) { // Check only odd numbers
//             boolean isPrime = true;
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.print(", " + i);
//             }
//         }
//         System.out.println(); // New line after the list of prime numbers
//     } else {
//         System.out.println("No prime numbers available.");
//     }
// }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         PrimeRange(a);

//     }
// }



// **************************** WAP TO CONVERT BINARY TO DECIMAL ***********************************


// import java.util.*;

//  public class JavaFunctions{

//     public static void Binary(int a){
//         int sum = 0 ;
//         int temp = a;
//         int b;
//         int i = 1;
//         while(temp>0){
//             b = temp%10;
//             sum = sum + (b*i);
//             temp =temp/10;
//             i = i*2;
//         }
//            System.out.print(sum);
//         // return sum;
//     }


//     public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("enter first number:");
//            int a = sc.nextInt();
//            Binary(a);
//     }

//  }


//  ****************** WAP TO CONVERT DECIMAL TO BINARY **************************

// import java.util.*;

//  public class JavaFunctions{

//     public static void DecToBin(int a){
//         int sum = 0;
//         int temp = a;
//         int b;
//         int i = 1;
//         while(temp>0){
//             b = temp%2;
//             sum = sum + b*i;
//             temp = (int)(temp/2);
//             i = i*10;
//         }
//            System.out.print(sum);
//     }


//     public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("enter the number:");
//            int a = sc.nextInt();
//            DecToBin(a);

//     }

//  }


//  **************** Write a Java method to compute the average of three numbers ****************


// import java.util.*;
// public class JavaFunctions{

//     public static void Average(int x, int y, int z){
//         int sum = x+y+z;
//         int avg = sum/3;
//         System.out.print("The Average of the Numbers is:" + avg);
//     }

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter First Number:");
//         int x = sc.nextInt();
//         System.out.print("Enter Second Number:");
//         int y = sc.nextInt();
//         System.out.print("Enter Third Number:");
//         int z = sc.nextInt();
//         Average(x,y,z);
//     }
// }


//  ****************** Write a Java program to check if a number is a palindrome and sum of digits in Java? ********************

import java.util.*;
public class JavaFunctions{

    public static void palindrome(int x){
        int rev= 0;
        int sum = 0;
        int temp = x;
        int b;
        while(temp>0){
            b = temp%10;
            rev = rev*10+ b;
            sum = sum +b;
            temp=temp/10;
        }
        System.out.println("the sum is: " + sum);
        if(rev==x){
            System.out.print("The number is palindrome");
        }
        else System.out.print("The number is not palindrome");
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x = sc.nextInt();
        palindrome(x);
    }
}