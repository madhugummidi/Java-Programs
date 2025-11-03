public class A8 {
   public static void main(String[] args)
   {
    for(int i=2;i<=16;i++)
    {
        if(i!=16)
        System.out.print(i+"*"+(i+1)+", ");
        else
        System.out.print(i+"*"+(i+1));
    }
    System.out.println();
    for(int i=2;i<=16;i++)
    {
        System.out.print(i*(i+1)+" ");
    }
   } 
}
