import java.util.Arrays;

public class CodingPractice {

    /* 
    public static void main(String[] args) {
        String str = "Madhu Gummidi";
        String str1 = str.toLowerCase();
        String result = "";
        for(int i=0;i<str1.length();i++)
        {
            char ch = str1.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
        }
        System.out.println(result);
    }
    */
    
    /*     
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] ch = str.toCharArray();
        boolean[] b = new boolean[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            if(!b[i])
            {
                int c=1;
                for(int j=i+1;j<ch.length;j++)
                {
                    if(ch[i]==ch[j])
                    {
                        b[j]=true;
                        c++;
                        //break;  
                    }
                }
                System.out.println(ch[i]+"---"+c);
            }
        }
    }
    */
    
    /*
    public static void main(String[] args) {
        
        int[] arr = {2,4,1,7};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        for(int i=min;i<max;i++)
        {
            boolean f = false;
            for(int num : arr)
            {
                if(num==i)
                {
                    f=true;
                    break;
                }
            }
            if(!f)
            System.out.println(i);
        }
    }
    */
    
    /*
        public static void main(String[] args) {
        String str = "madhugummidi";
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            if(!visited[i])
            {
                int c=1;
                for(int j=i+1;j<ch.length;j++)
                {
                    if(ch[i]==ch[j])
                    {
                        c++;
                        visited[j]=true;
                    }
                }
                System.out.println(ch[i]+"--->"+c);
            }
        }
    }
    */
    
    public static void main(String[] args) {
        String str = "madhuuu";
        String result = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
        }
        System.out.println(result);
    }
    
    
    
}
