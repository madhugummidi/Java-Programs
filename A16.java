public class A16 {
   public static void main(String[] args)
   {
      int sum=0;
      int count=0;
      for(int i=24;i<=100;i++)
      {
        sum+=i;
        count++;
      }
      float avg = sum/count;
      System.out.println(avg);  
   } 
}
