public class PrimeF {

    public boolean isPrime(int a)
    {
        for(int i=2;i<Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        PrimeF f = new PrimeF();
        System.out.println(f.isPrime(6));
    }
}
