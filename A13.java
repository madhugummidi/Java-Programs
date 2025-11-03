import java.util.Scanner;

public class A13 {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    if(a<100||a>1000)
    {
        System.out.println("Wrong number");
    }
    else
    {
        if(a%2==0)
        {
            System.out.println(a%3);
        }
        if(a%2==1)
        {
            System.out.println(a%2);
        }
    }
   } 
}
