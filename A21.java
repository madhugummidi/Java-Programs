import javax.lang.model.util.ElementScanner6;

public class A21 {
    public static void main(String[] args)
    {
        for(int i=10;i>-6;i--)
        if(i!=-5)
        System.out.print(i+"@"+(i-1)+",");
        else
        System.out.print(i+"@"+(i-1));
    }    
}
