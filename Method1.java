public class Method1 {
    void A(int a, String b)
    {
        System.out.println(a+","+b);
    }
    void B(String a, int b)
    {
        System.out.println(a+","+b);
    }
}
class M1{
    public static void main(String[] args) {
        Method1 m = new Method1();
        m.A(1,"Madhu");
        m.B("Ashok", 0);
    }
}
