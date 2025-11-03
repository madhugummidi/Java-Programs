import java.util.Scanner;

public class A11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Addition of two numbers is "+(a+b));
        System.out.println("Multiplication of two numbers is "+(a*b));
        System.out.println("Subtraction of two numbers is "+(a-b));
        System.out.println("Division of two numbers is "+(a/b));

    }
}
