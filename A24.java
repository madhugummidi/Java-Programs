import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i>=b;i--)
        {
            if(a>b)
            {
                if(i>0)
                {
                    if(i!=1)
                    System.out.print(","+" "+i*5);
                    else
                    System.out.print(i*5);
                }
                else
                {
                    if(i!=1)
                    System.out.print(","+" "+"("+(i*5)+")");
                    else
                    System.out.print("("+(i*5)+")");
                }
            }
            else
            {
                for(int i=a;i<=b;i++)
                {
                    if(i>0)
                    {
                        if(i!=1)
                        System.out.print(","+" "+i*5);
                        else
                        System.out.print(i*5);
                    }
                    else
                    {
                        if(i!=1)
                        System.out.print(","+" "+"("+(i*5)+")");
                        else
                        System.out.print("("+(i*5)+")");
                    }
                    
                }
            }
        }
    }
}