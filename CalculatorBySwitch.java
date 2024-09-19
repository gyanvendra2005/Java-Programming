import java.util.*;

public class CalculatorBySwitch{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        float a = sc.nextFloat();
        System.out.print("Enter your second number:");
        float b = sc.nextFloat();
        System.out.print("Enter your operator:");
        char c = sc.next().charAt(0);
        float result;
        switch(c){
            case '+':
                      result = a+b;
                      System.out.print(result);
                      break;
            
            case '-':
                      result = a-b;
                      System.out.print(result);   
                      break;  
            case '*':
                      result = a*b;
                      System.out.print(result);   
                      break;
            case '/':
                      result = a/b;
                      System.out.print(result);   
                      break; 
            case '%':
                      result = a%b;
                      System.out.print(result);   
                      break;
            default: System.out.print("!ENTERED OPERATOR IS INVALID") ;                     
        }
    }
}