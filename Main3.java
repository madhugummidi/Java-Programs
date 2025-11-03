class blue
{
    static
    {
        System.out.println("static block of class blue");
    }
    {
        System.out.println("non-static block of class blue");
    }
    blue()
    {
        System.out.println("Constructor of class blue");
    }
}
class Main3
{
	public static void main(String []args)
	{
		System.out.println("execution starts");
		new blue();
		System.out.println("-------------------------");
		new blue();
		System.out.println("execution ends");
	}
}