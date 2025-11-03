public class Strings {
    public static void main(String[] args)
    {
        String str = "Ma dh u";
        String str1= "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
            {
                str1=str1+ch;
            }
        }
        System.out.println(str1);
    }
}
