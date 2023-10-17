import java.util.Scanner;
public class Bmi {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("enter the height of a person in meters");
     float height = sc.nextFloat();
     System.out.println("enter the weight of the same person in kilogram5");
     float weight = sc.nextFloat();
     float b_mi = (weight)/(height*height);
     System.out.println("calculated BMI is :" +b_mi);


        
    }
}
