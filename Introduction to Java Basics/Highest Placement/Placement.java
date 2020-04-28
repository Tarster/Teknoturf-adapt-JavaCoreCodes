import java.util.Scanner;

public class Placement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no1, no2, no3;
        int max =0;
       
        System.out.println("Enter the no of students placed in CSE:" );
        no1 =sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:" );
        no2 =sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:" );
        no3 =sc.nextInt();
    //case when Input is less than -1
        if(no1 < 0 || no2 <0 || no3 <0)
        {
            System.out.println("Input is invalid");
        }
        
    //case when Input is equal
        else if( no1 == no2 && no2 == no3 )
        {
            System.out.println("None of the department has got the highest placement");
        }
        
        
    //Case to find the highest number of student in the set.
        else
        {
            max = no1>no2?(no1>no3?no1:no3):(no2>no3?no2:no3);
            System.out.println("Highest placement");
            if(max == no1)
            {
                System.out.println("CSE");
            }
            
            if(max == no2)
            {
                System.out.println("ECE");
            }
            
            if(max == no3) 
            {
                System.out.println("MECH");
            }
        }
     } 
    
}