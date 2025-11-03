public class A9 {
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=382;i<=582;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}
