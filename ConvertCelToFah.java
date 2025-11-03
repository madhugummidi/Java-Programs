import java.util.Scanner;
public class ConvertCelToFah {
    public static void main(String[] args)
    {
        System.out.println("Enter a temperature in celcius value");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float f = (c*9/5)+32;
        System.out.println("The value after converting from celcius to farenheit is :" +f); 
    }
}
