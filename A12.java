import java.util.Scanner;
public class A12 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of Kg");
    int a = sc.nextInt();
    int result = a*1000;
    System.out.println("After Converting kg to gms is "+result);
  }  
}
