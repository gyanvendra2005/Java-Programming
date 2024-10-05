// import java.util.*;
// public class StringbuilderQuestions{
//      public static void ToUpperCase(String str){
//          StringBuilder sb = new StringBuilder("");
//          char ch = Character.toUpperCase(str.charAt(0));
//          sb.append(ch);
//          for(int i=1;i<str.length();i++){
//             if(str.charAt(i-1)==' '){
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//          }
//          System.out.print(sb);
//     }
    
//      public static void main(String args[]){
//          String str = "converting firts letter to uppercase";
//          ToUpperCase(str);
//      }
// }


// ****************************STRING COMPRESSION******************************

import java.util.*;
public class StringbuilderQuestions{
     public static void strCompreser(String str){
         StringBuilder sb = new StringBuilder("");
         
         for(int i=0;i<str.length()-1;i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
         }
         System.out.print(sb);
    }
    
     public static void main(String args[]){
         String str = "aaaabbbbccccrrrttt";
         strCompreser(str);
        
     }
}