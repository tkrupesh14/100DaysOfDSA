import java.util.*;

public class Dsa3 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value 1: ");
        a = scanner.nextInt();

        System.out.print("Enter Value 2: ");
        b = scanner.nextInt();

        System.out.println("----------------");
        System.out.println("1 for Addition");
        System.out.println("2 for Substraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Quit");
        System.out.println("---------------");
        int n = 0;
        System.out.print("Enter Value: ");
        n = scanner.nextInt();
        switch(n){
            case 1:
                    System.out.println("Addition: " + (a+b));
                    break;
            case 2:
                    System.out.println("Substraction: " + (a-b));
                    break;
            case 3:
                    System.out.println("Multiplication: " + (a*b));
                    break;
            case 4:
                    System.out.println("Division: " + (a/b));
                    break;
            default:
                    break;
        }
    }
}
