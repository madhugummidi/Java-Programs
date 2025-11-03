import java.util.*;
public class duplicate {

    public boolean isPrime(int x)
    {
        boolean b = true;
        //int x = 5;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                return false;
              }
        }
        return true;
    }
    public static void main(String[] args)
    {
        duplicate d = new duplicate();
        //d.isPrime(5);
        if(d.isPrime(5))
        {
            System.out.println("P");
        }
        else{
            System.out.println("N");
        }

    }
}
