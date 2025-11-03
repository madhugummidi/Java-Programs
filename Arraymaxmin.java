public class Arraymaxmin {
    public static void main(String[] args) {
        String str = "abc";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int k = (int)ch-96;
            sum+=k;
            //System.out.println(k);
        }
        System.out.println(sum);
        
    }
}
