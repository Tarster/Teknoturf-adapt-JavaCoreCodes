import java.util.Scanner;
public class Count
{
    public static void main (String[] args)
    {
        
    
    Scanner sc = new Scanner(System.in);
    int i;
    int count =0;
    int countf=0;
    System.out.println("Enter the no. of subjects:");
    int no = sc.nextInt();
    if(no>0)
    {
    int marks[] = new int[no];
    for(i=0;i<no;i++)
    {
        marks[i] = sc.nextInt();
    }
    for(i=0;i<no;i++)
    {
        if(marks[i]>=50)
        {
            count= count+1;
        }
        else
        {
            countf = countf+1;
        }
    }
    if(countf==0 && count>0)
    {
        System.out.println("Ram passed in all subjects");
    }
    else if(countf>0 && count ==0)
    {
        System.out.println("Ram failed in all subjects");
    }
    else
    {
        System.out.println("Ram passed in " +count+ " subjects and failed in " +countf+ " subjects" );
    }
    }
    else
    {
        System.out.println("Invalid input range");
    }
    }
}