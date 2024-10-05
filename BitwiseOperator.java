// CHECK THE NO IS EVEN OR ODD


public class BitwiseOperator{
    public static void bitwiseevenodd(int num){
         int a =1;
         if((num & a) ==1){
            System.out.print("The entered number is odd");
         }
         else{
            System.out .print("The entered number is even");
         }
    }
    public static void main(String arg[]){
         int num = 56587;
         bitwiseevenodd(num);
    }
}