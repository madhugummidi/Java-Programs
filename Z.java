
class Z
{
   private void  display()
   {
     System.out.println("Class A");
   }
}
class B extends Z
{
    void display()
    {
        System.out.println("Class B");
    }
    public static void main(String[] args) {
        {
            Z ob = new B();
            ob.display();
            
        }
    }
}