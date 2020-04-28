import java.util.Scanner;
import java.lang.Math;

class FindFactor
{
    public static void main (String[] args)
    {   int i;
        Scanner sc =new Scanner(System.in);
        int factor =sc.nextInt();
        if(factor != 0)
            {   
                factor =Math.abs(factor);
                System.out.print("1, ");
                
                for(i=2; i <= (factor/2);i++)
                {
                    if(factor%i == 0)
                    { 
                        System.out.print(i+", ");
                    }
                }
                System.out.print(factor);
            }
        else
        {
            System.out.println("No factors");
        }
    }//End of main
}