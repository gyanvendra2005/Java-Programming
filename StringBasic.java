import java.util.*;
public class StringBasic {

	public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        // Way to define string
        String str = "Hello World";
        String str2 = new String("Java Programming");
        // Take Input of string
        // String str3;
        // str3 = sc.nextLine();
        // System.out.println(str3);
        // // length property in string
        // System.out.println(str3.length());

        // CONCATENATION

        String fullName;
        String FirstName = "Gyanvendra";
        String LastName = "Singh";
        fullName = FirstName+" "+LastName;
        System.out.println(fullName);
    }
}