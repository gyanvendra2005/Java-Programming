import java.util.*;
public class JavaInput{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Your name:");
        String name = sc.next();
        System.out.println(a);
        System.out.println(name);
        Float price= sc.nextFloat();
        String school = sc.nextLine();
        System.out.println(price);
        System.out.println(school);
    }
}