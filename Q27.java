import java.util.Scanner;
class Q27
{
	static Scanner sc = new Scanner(System.in);
	String m1(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
		
	}
	public static void main(String[] args)
	{
		Q27 obj = new Q27();
		String s = obj.m1(sc.nextInt());
		System.out.println(obj.m2(s)); 
	}
}

