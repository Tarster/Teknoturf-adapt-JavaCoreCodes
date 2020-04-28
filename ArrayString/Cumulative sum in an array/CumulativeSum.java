import java.util.Scanner;
public class CumulativeSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array[];
        int cumu[];
        int i;
        System.out.println("Enter the number of elements");
        int no = sc.nextInt();
        if(no>0)
        {
            array = new int[no];
            System.out.println("Enter the elements");
            for(i=0;i<no;i++)
            {
                array[i] = sc.nextInt();
            }
            cumu = new int [no];
            cumu[0] = array[0];
            for(i=1;i<no;i++)
            {
                cumu[i] = cumu[i-1] + array[i];
            }
            for(i=0;i<no;i++)
            {
                System.out.print(cumu[i]+ " ");
            }
        }
        else
        {
            System.out.println("Invalid Range");
        }
        
    }
}