package Java;
import java.util.*;
public class Input {
    public static void main(String args[]){
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is "+name);
        //Sum of two input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of a"+ a +"and b "+ b + " is " + sum  );
    }
}
