import java.util.Scanner;
public class Pattern2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value for n :");
    int n = sc.nextInt();
    for (int i = 1 ; i<=n ; i++)
    {
        for(int j = 1 ; j<=i-1 ; j++){
        System.out.print(" ");
    } 
    
     for(int k = 1 ; k<=n ; k++)
     {
       
        System.out.print("*");
         if(k == 2 || k == 3){
            System.out.print(" ");
        }
     }

      System.out.println();
}
      
 }   
}
