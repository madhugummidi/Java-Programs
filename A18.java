import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class A18 {
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a<0||a>100)
        {
            System.out.println("Invalid Input");
        }
        else if(a>=90&&a<=100)
        {
            System.out.println("Super Smart");
        }
        else if(a>=80&&a<90)
        {
            System.out.println("Smart");
        }
        else if(a>=70&&a<80)
        {
            System.out.println("Smart Enough");
        }
        else if(a>=60&&a<70)
        {
            System.out.println("Just Smart");
        }
        else if(a>=35&&a<60)
        {
            System.out.println("No Smart");
        }
        else if(a>=0&&a<35)
        {
            System.out.println("Dump");
        }
   } 
}
