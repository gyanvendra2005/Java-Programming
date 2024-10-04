// ******************* palindrome *********************

// public class StringQuestions{
//     public static void main(String arg[]){
//         String str = "abcba";
//         String temp;
//         int n = str.length();
//         int i=0;
//         int j= n-1;
//         int flag=0;
//         while(i<=n/2){
//            if(str.charAt(i)==str.charAt(j)){
//             flag =1;
//            }
//            else{
//               flag=0;
//               break;
//            }
//            i++;
//            j--;
//         }
//         if(flag==1){
//             System.out.print("palindrome");
//         }
//     }
// }


// ************************* SHORTES DISTANCE IN A ROUTE CONTANING FOUR DIRECTION N,S,E,W*********************
// import java.util.*;
// public class StringQuestions{
//     public static void main(String arg[]){
//         Scanner sc= new Scanner(System.in);
//         String str;
//         System.out.print("Enter directions in term of N,S,E,W:");
//         str = sc.next();
//         int x = 0;
//         int y = 0;
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='N'){
//                y++;
//             }
//             else if(str.charAt(i)=='S'){
//                 y--;
//             }
//             else if(str.charAt(i)=='E'){
//                 x++;
//             }
//             else if(str.charAt(i)=='W'){
//                 x--;
//             }
//             else{
//                 System.out.print("INVALID INPUT");
//             }
//         }
//         double x2 = x*x;
//         double y2 = y*y;
//         double distance = Math.sqrt(x2+y2);
//         System.out.print("Shortest Distance is:"+distance);
//     }
// }

// *********************** TO PRINT LARGEST STRING *******************

public class StringQuestions{
    public static void main(String arg[]){
        String fruits[]={"apple","pineapple","mango","banana"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
               largest= fruits[i];
        }
        }
        System.out.print(largest);
    }
}