class EvenOdd
{
    public static void main(String[] args)
    {
        int n=10;
        while(n>1)
        {
            n=n-2;
        }
        if(n==1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
    }
}