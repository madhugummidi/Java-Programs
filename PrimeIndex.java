import java.util.Scanner;

public class PrimeIndex {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
        int count1=0;
        for(int i=2;i<=a;i++)
        {
            //int count1=0;
            int count=0;
            for(int j=1;j<=a;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                count1++;
                if(count1%2==1)
                {
                    System.out.print(i+" ");
                } 
            }
             
        }  
    }
}
