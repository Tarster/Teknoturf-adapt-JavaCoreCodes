import java.util.Scanner;
public class Factorial
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int i,j,temp,z=1;
        int sum=0;
        int fact=1;
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        if(size>0)
        {
            array = new int[size];
            System.out.println("Enter the elements");
            for(i=0;i<size;i++)
            {
                array[i]=sc.nextInt();
            }
            for(i=0;i<size;i++)
            {
                temp = array[i]/10;
                if((temp==0)&&(array[i]>0))
                {
                    for(j=1;j<=array[i];j++)
                    {
                        fact = fact*j;
                        //sum = sum+fact;
                    }    
                    sum = sum + fact;
                    fact=1;
                    z=0;
                }
                
            }//sum=sum+fact;
            if(z==0)
            {
                System.out.println(sum);
            }
            else
            {
                System.out.println("No positive and single digit numbers found in an array");
            }
            
        }
        else{
            System.out.println("Invalid size");
        }
    }
}