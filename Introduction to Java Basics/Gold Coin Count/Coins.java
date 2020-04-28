import java.util.Scanner;
public class Coins
{
    public static void main(String[] args)
    {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
         age = sc.nextInt();
        
        if (age>0 && age <= 11)
        {
         int coins = age*age*age;
         System.out.println("Meenu gets " +coins+ " coins");
        }
        
        else
        {
            System.out.println("Invalid age");
        }
    }
    
    
}