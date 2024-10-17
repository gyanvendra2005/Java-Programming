// CHECK THE NO IS EVEN OR ODD

// public class BitwiseOperator{
//     public static void bitwiseevenodd(int num){
//          int a =1;
//          if((num & a) ==1){
//             System.out.print("The entered number is odd");
//          }
//          else{
//             System.out .print("The entered number is even");
//          }
//     }
//     public static void main(String arg[]){
//          int num = 56587;
//          bitwiseevenodd(num);
//     }
// }

// FIND THE ith BIT OF A NUMBER

// public class BitwiseOperator{
//     public static void GetValueAti(int num,int i){
//         int a=1; //0001
        
//         if((num & a<<i)==0){
//             System.out.print("The value at "+i+" th term is:0");
//         }
//         else{
//             System.out.print("The value at "+i+" th term is:1");
//         }
//     }
//     public static void main(String arg[]){
//         int num=15; // 0001111
//         int i=3;
//         GetValueAti(num,i);
//     }
// }

// TO CHANGE THE VALUE OF ith TERM

// public class BitwiseOperator{
//     public static void ChangeValue(int num,int i){
//         int bitmark = 1<<i;
//         num = num | bitmark;
//         System.out.print(num);
//     }
//     public static void main(String arg[]){
//         int num = 10; // 00001001
//         int i =2;
//         ChangeValue(num,i);
//     }
// }

// TO CLEAR THE ith BIT FROM A NUMBER

// public class BitwiseOperator{
//     public static void Clear(int num,int i){
//         int bitmark =~(1<<i);
//         num = num & bitmark;
//         System.out.print(num);
//     }
//      public static void main(String arg[]){
//         int num = 10; // 0001111
//         int i =1;
//         Clear(num,i);
//      }
// }


// TO CHECK A NUMBER IS A POWER OF 2 OR NOT 


// public class BitwiseOperator{ 
   //public static void Power(int num){
//         if((num&(num-1))==0){
//             System.out.print("Entered  number is a power of 2");
//         }
//         else{
//             System.out.print("Entered number is not power of 2");
//         }
//     }

//     public static void main(String arg[]){
//         int num = 16;
//         Power(num);
//     }
// }



//  TO FIND NO OF 1 BIT IN A NUMBER

    // public class BitwiseOperator{

    //     public static void countSetBit(int num){
    //         int count=0;
    //         while(num>0){
    //             if((num & 1) !=0){
    //                 count++;
    //             }
    //             num = num>>1;
    //         }
    //         System.out.print(count);
    //     }

    //     public static void main(String arg[]){
    //         int num = 15;
    //         countSetBit(num);
    //     }

    // }


 // FAST EXPONENTIAL QUESTIONS   

//    public class BitwiseOperator{
//       public static void fastExpo(int num, int pow){
//         int ans =1;
//         while(num>0){
//             if((pow & 1 )!=0){
//                ans = num*ans;
//             }
//             num = num*num;
//             pow = pow>>1;
            
//         }
//         System.out.print(ans);
//    }
//       public static void main(String arg[]){
//         int num = 3;
//         int pow = 5;
//         fastExpo(num,pow);
//       } 
//    }