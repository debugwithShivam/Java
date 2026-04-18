package Java;
import java.util.*;
public class Conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Age ");
        int age = sc.nextInt();
        
        // if-else
        if(age >= 18){
            System.out.println("You Are a Adult");
        }else{
            System.out.println("You Are Not a Adult");
        }
        
        System.out.println("Check even or odd");
        int x = sc.nextInt();
        
        if(x % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        };
        
        System.out.println("Check two variables are equal or not");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else {
            if(a > b){
                System.out.println("a is greater then b");
            }else{
                System.out.println("a is lesser then b");
            }
        }
        
        // else if
        if(a == b ){
            System.out.println("Equal");
        }else if(a>b){
            System.out.println("a is greater then b");
        }else{
            System.out.println("a is lesser then b");
        }

        //Switch
        int button = sc.nextInt();
         switch (button) {
            case 1:System.out.println("Hello");
                break;
            case 2:System.out.println("Namaste");
                break;
            case 3:System.out.println("Bonjour");
            default:System.out.println("Invalid Button");
                break;
         }
    }
}
