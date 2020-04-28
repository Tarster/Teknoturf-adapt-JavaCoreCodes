import java.util.Scanner;
public class PrimeNumbers
{
   static int prime(int num)
    {   int i;
    
        if(num ==0 || num == 1)
        {
            return -1;
        }
        
        for(i =2;i<=(num/2);i++)
        {
            if(num%i == 0)
            {
                return -1;
            }
        }
        
        return num;
    }
    
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int start=-1,end=-1;
        start = sc.nextInt();
        end = sc.nextInt();
        int num=0;
        if(start > 0 && end > 0)
        {
            if(start<end)
            { while(start<=end)
                {
                    num =prime(start);
                    if(num > 0)
                    {
                        System.out.print(num + " ");
                    }
                    start++;
                }
        
            }
            else
            {
                System.out.println("Provide valid input");
            }
        }
        
        else 
        {
            System.out.println("provide valid input");
        }
        
    }
}