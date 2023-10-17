import java.util.Scanner;
public class Student {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the name of student");
        String name = sc.nextLine();
        System.out.println("Enter the class of student");
        int std_class= sc.nextInt();
        System.out.println("enter marks of maths :");
        float mark_1 = sc.nextFloat();
        System.out.println("enter marks of science :");
        float mark_2 = sc.nextFloat();
        System.out.println("enter marks of english :");
        float mark_3 = sc.nextFloat();
        System.out.println("enter marks of hindi :");
        float mark_4 = sc.nextFloat();
        System.out.println("enter marks of computer :");
        float mark_5 = sc.nextFloat();
        System.out.println("enter marks of social science :");
        float mark_6 = sc.nextFloat();
        System.out.println(" SUBJECTS :-");
        System.out.println("maths" +maths);
        System.out.println("science" +science);
        System.out.println("english");
        System.out.println("hindi");
        System.out.println("computer");
        System.out.println("social science");
        float obt_marks=mark_1+mark_2+mark_3+mark_4+mark_5;
        float avg= (obt_marks/6);
        System.out.println("average marks :-"+ avg);
        float per=((obt_marks/600)*100);
        System.out.println("Percentage : "+per);

    }
        
    }

