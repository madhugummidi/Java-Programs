public class Strings1 {
    /*
    public static void main(String[] args) {
        String str = "madhu gummidi";
        String[] str1 = str.split(" "); //String[] str1 = {"madhu","gummidi"};
        String output = "";
        for(int i=0;i<str1.length;i++)
        {
            String word = str1[i];
            String s ="";
            for(int j=word.length()-1;j>=0;j--)
            {
                s=s+word.charAt(j);
            }
            output=output+s+" ";
        }
        System.out.println(output);
    }
    */
    
    public static void main(String[] args) {
        char[] ch = {'m','a','d','h','u','g','u','m','m','i','d','i'};
        boolean[] visited = new boolean[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            if(!visited[i])
            {
                for(int j=i+1;j<ch.length;j++)
                {
                    if(ch[i]==ch[j])
                    {
                        count++;
                        visited[j]=true;
                        //break;
                    }
                }
                System.out.println(ch[i]+"-----"+count);
            }   
        }
    }
}
