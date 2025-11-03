public class insertele {
    public static void main(String[] args)
    {
        int[] a = new int[5];
        a[0]=2;
        a[1]=3;
        a[2]=6;
        a[3]=9;
        int index = 2;
        int n = 100;
        for(int i=a.length-2;i>=index;i--)
        {
            a[i+1]=a[i];
        }
        //a[index]=n;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
