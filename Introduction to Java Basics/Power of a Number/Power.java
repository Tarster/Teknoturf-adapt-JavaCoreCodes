import java.util.Scanner;
import java.lang.Math;
public class Power
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the digit");
        int power = sc.nextInt();
        powerCal(number,power);
        
    }
       static void powerCal(int num,int powernum)
        {
            long powernumber =1;
            if(num>=0 && powernum>=0)
                {
                    for(int i=1;i <=powernum ; i++)
                    {
                        powernumber *=num;
                    }
                    System.out.println(powernumber);
                }
            else
            {
            System.out.println("Invalid Input");
            }
        }
        
        
}