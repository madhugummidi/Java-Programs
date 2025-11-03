import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int count=0;
        // if(x==0||x==1)
        // {
        //     System.out.println("Not Prime");
        // }
        // for(int i=1;i<=x;i++)
        // {
        //     if(x%i==0)
        //     {
        //         count++;
        //     }
        // }
        // if(count==2)
        // {
        //     System.out.println("Prime");
        // }
        // else
        // {
        //     System.out.println("Not Prime");
        // }
        if(x==0||x==1)
        {
            System.out.println("Not prime");
        }
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
            {
                count++;
            }
            if(count==1)
            {
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }

        
    }
}
