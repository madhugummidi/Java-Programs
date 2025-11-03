public class insertchar {
    public static void main(String[] args)
    {
        char[] a = new char[5];
        a[0]='a';
        a[1]='b';
        a[2]='c';
        a[3]='d';
        int index = 3;
        char n = 'e';
        for(int i=a.length-2;i>=index;i--)
        {
            a[i+1]=a[i];
        }
        a[index]=n;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
