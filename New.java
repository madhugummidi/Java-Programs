public class New {
    public static void main(String[] args)
    {
        /*int m=15;
        int n=m++ + --m + 10;
        int s = m++ + --n + ++n + m++;
        int y = s-- + --m + --n + -5;
        
        System.out.println(n);
        System.out.println(s);
        System.out.println(y );
        */
        int x = 25;
        int y = ++x + x++ + --x + x-- + 30;
        int z = x++ + y-- + ++x + ++y + y++ - 5;
        int w = z++ - --y + ++z + 20;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);

        
    }
}
