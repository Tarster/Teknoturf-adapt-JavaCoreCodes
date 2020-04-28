import java.util.Scanner;

class FindNumber
{
    //int i;
    public static int isFactorial(int fact)
    {
        int i;
        for(i=1;;i++)
        {
            if(fact%i==0)
            {
                fact /=i;
            }
            else
            {
                break;
            }
        }i--;
         if(fact == 1)
         {
             return i;
         }
         else 
         {
             return -1;
         }
        //return i;
            
    }
    public static void main (String[] args) 
    {
        Scanner sc =new Scanner(System.in);
         int fact = sc.nextInt();
         
        
        if(fact > 0)
        {
            int num = isFactorial(fact);
            if (num!= -1)
            {
                System.out.println(num);
            }
            else
            {
                System.out.println("Sorry. The given number is not a perfect factorial");
            }
        }
        
        else
        {
            System.out.println("Invalid Input");
        }
    }
}