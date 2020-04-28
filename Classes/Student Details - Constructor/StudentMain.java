import java.util.Scanner;
//import java.lang.*;
public class StudentMain
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name= sc.next();
        System.out.println("Enter Student's address:");
        String add = sc.next();
        int z= 0;
        while(z==0)
        {
        System.out.println("Whether the student is from NIT (Yes/No):");
        String ans = sc.next();
        if(ans.equals("Yes") || ans.equals("yes"))
        {
            z=1;
            Student stunit = new Student(id,name,add);
        }
        else if(ans.equals("No") || ans.equals("no"))
        {
            z=1;
            System.out.println("Enter the college name:");
            String col = sc.next();
            Student stu = new Student(id,name,add,col);
        }
        else
        {
            System.out.println("Wrong input");
            //System.out.println("Whether the student is from NIT(YES/NO):");
           // String ans = sc.next();
        }
        //}while((!ans.equals("Yes")) ||(!ans.equals("No")));
        }
    }
}