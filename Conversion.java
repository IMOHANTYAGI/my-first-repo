import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the temperature :");
    float temp = sc.nextFloat();
    float cel = (temp - 32) * (5/9) ;
    System.out.println("temperature in farenheit"+temp);
    System.out.println("temperature in celsius :"+cel);
    

    }
    
    
}
