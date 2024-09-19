// ****************** Write a program to find the factorial of any number entered by the user *******************

/*

import java.util.*;
public class LoopsQuestions {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for factorial: ");
        int num = sc.nextInt();
        int fact = 1 ;
        for(int i=1; i<=num ; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+ num + " is: " + fact);
    }
}  

*/

// Write a program to print the multiplication table of a number N, entered by the user.

import java.util.*;
public class MultiplicationTable{	
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for multiplication table: "); 
        int num = sc.nextInt();				 
        int x=1 ;
        for(int i =1;i<=10 ;i++){
             System.out.println(num*i);
        }
    }
}