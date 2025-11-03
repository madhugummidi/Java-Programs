import java.util.Scanner;
class positive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0)
		{
			if(a>10)
			{
				System.out.println("It has two digits");
			}
			else
			{
				System.out.println("It has only one digit");
			}
		}
		else if(a<0)
		{
			if(a<-10)
			System.out.println("It is less than -10");
			else
			System.out.println("It is greater than -10");
		}
		else
		{
			System.out.println("Number is 0");
		}
	}
}