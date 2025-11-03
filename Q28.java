import java.util.Scanner;
class Q28
{
	static Scanner sc = new Scanner(System.in);
	static Q28 obj = new Q28();
	float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	long m2(float f)
	{
		System.out.println(f);
		return sc.nextLong();
	}
	long m3(String s);
	{
		System.out.println(s);
		return obj.m2(obj.m1(sc.nextInt()));
	}
	public static void main(String[] args)
	{
		System.out.println(obj.m3(sc.next()));	 
	}
}