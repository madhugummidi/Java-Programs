import java.util.Scanner;
public class ABC {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>=90);
		{
			System.out.println("You got A Grade");	
		}
		else if(marks>=80&&marks<90)
		{
			System.out.println("You got B Grade");
		}
		else if(marks>=70&&marks<80)
		{
			System.out.println("You got C Grade");
		}
		else if(marks>=600&&marks<70)
		{
			System.out.println("You got D Grade");
		}
		else
		{
			System.out.println("You are fail");
		}
	}
    
}
