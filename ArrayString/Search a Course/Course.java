import java.util.*;
///import java.util.Scanner;
public class Course
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String course[] = new String[5];
        System.out.println("Enter no of course:");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("Enter course names:");
            for(i=0;i<n;i++)
            {
                course[i] = sc.next();
            }
            System.out.println("Enter the course to be searched:");
            String search = sc.next();
            List list = Arrays.asList(course);
            if(list.contains(search))
            {
                System.out.println( search + " course is available" );
            }
            else
            {
                System.out.println( search + " course is not available");
            }
            
        }
        else
        {
            System.out.println("Invalid range");
        }
    }
}