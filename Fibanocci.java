/**
 * Fibanocci
 */
public class Fibanocci {

    public static void main(String[] args) {
        int n=17;
        int a=0;
        int b=1;
        int c;
        int count=0;
        for(int i=1;i<=1000;i++)
        {
            count++;
            if(count==n)
            {
            System.out.println(a);
            }
            c=a+b;
            a=b;
            b=c;
        }

    }
}