public class Chararr {
    public static void main(String[] args)
    {
        char[] ch1 = new char[6];
        char[] ch = {'a','e','i','o','u'};
        ch[4]='x';
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }   
    }
}
