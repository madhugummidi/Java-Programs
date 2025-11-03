import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args)
    {
    System.out.println("Enter First number ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Enter Second number");
    int b = sc.nextInt();
    System.out.println("Enter Third number");
    int c = sc.nextInt();
    int max = ((a>b)&&(a>c)?a:(b>c)?b:c);
    System.out.println("The Largest of three numbers is: "+max);
    }
}