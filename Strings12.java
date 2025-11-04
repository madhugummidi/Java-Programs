import java.util.*;

import java.util.ArrayList;
import java.util.Collections;

public class Strings12 {

    /* 
        public static void main(String[] args) {
            int x =100;
            String s = Integer.toString(x);
            char[] ch = s.toCharArray();
        }
    */

    

    /*
    //String 
    //input:"Hello World" output:"World Hello"

    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String output=" ";
        for(int i=words.length-1;i>=0;i--)
        {
            //output=output+words[i]
            output+=words[i]+" ";
        }
        System.out.print(output);
    }
    */
       


    /*
        //String 
        //input: "Hello World"   output: olleH dlroW
        public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        String output = "";
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            String rev = "";
            for(int j=word.length()-1;j>=0;j--)
            {
                rev+=word.charAt(j);
            }
            output+=rev+" ";
        }
        System.out.println(output);
    }
    */
    
    
    

    /* 
    //Count no of 1's in input
    // input:101231  output:3
    public static void main(String[] args) {
        int x = 101231;
        String str = Integer.toString(x);
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    */



    /* 
    //Find Max Element in array
    //input: {1,8,9,4,5};   output: Firstmax=9 SecondMax=8
    public static void main(String[] args) { 
        int[] arr = {1,8,9,4,5};
        int max=0;
        int max1=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>max1 && arr[j] <max)
            {
                max1=arr[j];
            }
        }

        System.out.println(max1);
    }
    */



    /* 
    //Palindrome String
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        String str1 ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }

        if(str1.equalsIgnoreCase(str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    */




    /* 
        Palindrome Number
        public static void main(String[] args) {
            
            int x = 102;
            int temp=x;
            int rev=0;

            while(temp>0)
            {
                int rem = temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }

            if(rev==x)
            {
                System.out.println("Palindrome");
            }

            else
            {
                System.out.println("Not a Palindrome");
            }
        }
    */

    
    /* 
    //Common Elements in Array
    public static void main(String[] args) {       
    int[] arr = {1,2,4};
    int[] arr1 = {2,3,4};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                System.out.println(arr[i]);
            }
        }
    }
    } 
    */


    /* 
    //String Length Without Inbuilt Method
    public static void main(String[] args) {
        
        String str = "Hello";
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++)
        {
            count++;
        }
        System.out.println(count);
    }
    */


    /* 
    public static void main(String[] args) {
        
        String str = "Helloo ";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                count++;
            }
        }
        System.out.print(count);
    }
    */

    /* 
    public static void main(String[] args) {

        int x = 120;
        int sum = 0;
        while(x>0)
        {
            int lastDigit = x%10;
            sum+=lastDigit;
            x=x/10;
        }
        System.out.println(sum);
    }
    */

    /* 
    public static void main(String[] args) {
        String str = "Hello";
        int sum = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                sum+=str.charAt(i)-64;
            }    
            else
            {
                sum+=str.charAt(i)-96;
            }    
        }
        System.out.println(sum);
    }
    */ 


    /*
    public static void main(String[] args) {
        
        int[] arr = {4,0,1,2,0,4,3,0,2,1};
        int[] arr1 = new int[arr.length];
        
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr1[index]=arr[i];
                index++;
            }
        }
        for(int j=0;j<arr1.length;j++)
        {
            System.out.print(arr1[j]+" ");
        }
    }
    */    
    

    
    /* 
    public static void main(String[] args) {
        
        String str = "GoodMorning";
        String str1 = str.substring(4);
        String str2 = str.substring(0, 4);
        String output = str1+str2;
        System.out.println(output);
    }
    */



    /* 
    public static void main(String[] args) 
    {
        String str = "Hello World World";
        String[] words = str.split(" ");
        boolean[] visited = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        visited[j] = true;
                    }
                }
                if(count>1)
                System.out.println(words[i] + " -> " + count);
            }
        }
    }
    */
   


    /*
    public static void main(String[] args) 
    {
        String str = "Hello";
        char[] chars = str.toCharArray();   // Convert string to character array
        boolean[] visited = new boolean[chars.length];
        String out = "";
        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                //out = out+chars[i]+count;
                System.out.println(chars[i] + " ---> " + count);
            }
        }
        //System.out.println(out);
    }
    */


 /*
 public static void main(String[] args) {
    
    int[] arr = {1,2,3,1,4,3};
    boolean[] visited = new boolean[arr.length];
    for(int i=0;i<arr.length;i++)
    {
        if(!visited[i])
        {
            int count = 1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Count of " + arr[i] + "---> " + count);
        }
    }
}
*/

/*
public static void main(String[] args) {
    String str = "Hellooo";
    String str1 = str.toLowerCase();
    boolean[] b =new boolean[256];
    for(int i=0;i<str1.length();i++)
    {
        char ch = str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            if(!b[ch])
            {
                System.out.println(ch);
                b[ch]=true;
            }    
        }
    }   
}
*/

/*
public static void main(String[] args) {
    
    String str = "Hello";
    boolean[] b = new boolean[256];
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(!b[ch])
        {
            System.out.println(ch);
            b[ch]=true;
        }
    }
}
*/


/*
public static void main(String[] args) {

    String str = "Hello";
    boolean[] b = new boolean[256];
    for(int i=0;i<str.length();i++)
    {
        int count=1;
        char ch = str.charAt(i);
        if(!b[ch])
        {
            for(int j=i+1;j<str.length();j++)
            {
                char ch1 = str.charAt(j);
                if(ch==ch1)
                {
                    count++;
                    b[ch]=true;
                }
            }
            System.out.println(ch+"--------> "+count);
        }    
    }
}
*/ 

/*
 public static void main(String[] args) {
    
    String str = "Hello";
    String result = "";
    for(int i=0;i<str.length();i++)
    {
        char ch = str.charAt(i);
        if(result.indexOf(ch) == -1)
        {
            result += ch;
        }
    }
    System.out.println(result);   
}
*/  

/*
    public static void main(String[] args) 
    {

        String str = "Madhu.Gummidi@123";
        int str1 = str.indexOf('@');
        String str2 = str.substring(str1+1);
        System.out.println(str2);

        int str3 = str.indexOf('.');
        String str4 = str.substring(0, str3);
        System.out.println(str4);
        
        String str5 = str.substring(str3+1, str1);
        System.out.println(str5);
        System.out.println(str2+str4+str5);

    }
*/

    /*
    public static void main(String[] args) {
        
        int x = 101201;
        int c =0;
        while(x>0)
        {
            int rem = x%10;
            if(rem==1)
            {
                c++;
            }
            x=x/10;
        }
        System.out.println(c);
    }
    */

     /*    
     public static void main(String[] args) {
        
        int[] arr = {5,7,2,9,3};
        ArrayList<Integer> l = new ArrayList<>();
        for(int x : arr)
        {
            l.add(x);
        }
        int s = Collections.min(l);
        int la = Collections.max(l);

        for(int i=s;i<=la;i++)
        {
            if(!l.contains(i))
            {
                System.out.print(i+" ");
            }

        }
     }
    */
    
    /*
    public static void main(String[] args) { 
        int[] arr = {5,7,2,9,3};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        for(int i=min;i<=max;i++)
        {
            boolean found = false;
            for(int num:arr)
            {
                if(num==i)
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {                    
                System.out.println(i+" ");
            }
        }
    }
    */


    /* 
     public static void main(String[] args) {
        int[] arr = {5,7,5,2,9,3};
        int[] arr1 = new int[arr.length];
        int c =0;
        for(int i=0;i<arr.length;i++)
        {
            boolean f = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                   f=true;
                   break;
                }
            }
            if(!f)
            {
                arr1[c]=arr[i];
                c++;
            }
        }
        for(int k=0;k<c;k++)
        {
            System.out.println(arr1[k]+" ");
        }
     }
    */


    /*
    public static void main(String[] args) {
        
        String str = "Hellooo";
        String output = "";
        for(int i=0;i<str.length();i++)
        {
            boolean f = false;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    f=true;
                    break;
                }
            }
            if(!f)
            {
                output+=str.charAt(i);
            }
        }
        System.out.println(output);
    }   
    */


    /*
    public static void main(String[] args) {
        
        int[] arr = {10,2,4,8,5,1};
        int min = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[min])
            {
                min = i;
            }
        }
        System.out.println("Minimum Index is "+min);
        System.out.println("Minimum Element is "+arr[min]);
    }
    */
    
    
    /* 
    public static void main(String[] args) {
        String str = "madhu gummidi";
        String[] str1 = str.split(" ");
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


    /*
    public static void main(String[] args) {
        int x = 234;
        int sum = 0;
        while(x>0)
        {
            int fact=1;
            int rem = x%10;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i; 
            }
            sum=sum+fact; 
            x=x/10;
        }
        System.out.println(sum);
    } 
    */  
    

    /*
    public static void main(String[] args) {
        String s = "cat";
        String t = "tat";
        if(s.length() != t.length())
        {
            System.out.println("False");
            return;
        }

        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(Arrays.equals(ch,ch1))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    */


    /*
    public static void main(String[] args) {
        
        int[] arr = {1,5,2,4};
        Arrays.sort(arr);
        int min = 0;
        int max = arr[arr.length-1];
        int sum=0;
        int sum1=0;
        for(int i=min;i<=max;i++)
        {
            sum+=i;
        }
        for(int j=0;j<arr.length;j++)
        {
            //if(arr[j]>1)
            sum1+=arr[j];
        }
        int result = sum-sum1;
        System.out.println(result);
    }
    */
    

    /* 
    public static void main(String[] args) {
        String str = "Hello";
        String strOutput = "olleH";

        String str1 = "Hello World";
        String str1Output = "World Hello";

        String str2 = "Hello World";
        String str2Output = "olleH dlroW";

        String str3 = "Hello World";
        String str3Output = "H1e1l3o21W1r1d1";
        
        String str4 = "Hello World";
        String str4Output = "eo";

        String str5 = "()(())()";
        String str5Output = "(((())))";

        int[] arr = {2,4,1,5};

        //missing Number = 3;
        //minimum number = 1;
        //maximum number = 5;
        //min numberIndex = 2;
        //max numberIndex = 3;    
    */

    /* 
    public static void main(String[] args) {
        String str = "Hello World";
        String[] str1 = str.split(" ");
        String output = "";
        for(int i=0;i<str1.length;i++)
        {
            String str2 = str1[i];
            for(int j=str2.length()-1;j>=0;j--)
            {
                output+=str2.charAt(j);
            }
        }
        System.out.println(output);
    }
    */

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "AEIOUaeiou";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(str1.contains(String.valueOf(ch)))
            {
                System.out.println(ch);
            }
        }
    }
}
