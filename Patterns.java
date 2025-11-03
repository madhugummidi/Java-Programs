public class Patterns {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=5*2+1;j>i*2;j--)
            {
                System.out.print("*");
            }
          
            System.out.println();
        } 
    }
    
}
