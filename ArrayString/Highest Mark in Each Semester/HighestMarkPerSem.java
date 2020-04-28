import java.util.Scanner;
public class HighestMarkPerSem
{
    static int maxFinder(int MyArray[])
    {
        int i,temp=MyArray[0];
        for(i=0;i<MyArray.length;i++)
        {
            if(temp<MyArray[i])
            {
                temp=MyArray[i];
            }
        }
        return temp;
    }
    public static void main (String[] args)
    {
        int i,j,z=0;
        int subjects=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester");
        int no = sc.nextInt();
        int trueArray[][] = new int[no][];
        for(i=0;i<no;i++)
        {
            System.out.println("Enter no of subjects in " +(i+1)+ " semester:");
            subjects = sc.nextInt(); 
            trueArray[i] = new int[subjects];
        }
        int maxArray[] = new int[no];
        for(i=0;i<no;i++)
        {
            System.out.println("Marks obtained in semester " +(i+1));
           
            for(j=0;j<trueArray[i].length;j++)
            {
                trueArray[i][j] = sc.nextInt();
                
                if(trueArray[i][j]>-1 && trueArray[i][j]<101)
                {
                 
                }
                else
                {
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
              
            }
            maxArray[i]= maxFinder(trueArray[i]);
        }
        
            for(i=0;i<no;i++)
            {
            System.out.println("Maximum mark in " +(i+1)+ " semester:" +maxArray[i]);
        }
        
        
    }
}