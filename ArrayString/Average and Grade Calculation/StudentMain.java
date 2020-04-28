import java.util.Scanner;
public class StudentMain
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        int z=0;
        System.out.println("Enter id:");
        int id = sc.nextInt();
        stu.setId(id);
        System.out.println("Enter the name:");
        String name = sc.next();
        stu.setName(name);
        System.out.println("Enter the no of subjects:");
        int no = sc.nextInt();
        if(no>0)
        {
            z=0;
        }
        else
        {
            System.out.println("Invalid number of subjects");
            System.exit(0);
        }
        int marks[] = new int[no];
        if(z==0)
        {
           int val = -1;
           for(int i=0;i<no;i++)
           {
               System.out.println("Enter the mark for subject " +(i+1)+ ":");
               val = sc.nextInt();
               if(val>-1 && val<101)
               {
                   marks[i] = val;
                   stu.setMarks(marks);
               }
               else
               {
                   System.out.println("Invalid marks");
                   System.exit(0);
                    
               }
           }
        }
       // stu.setMarks(marks);
        //Student stu = new Student(id,name,marks);
        stu.calculateAvg();
        stu.findGrade();
        System.out.println("Id:" +stu.getId());
        System.out.println("Name:" +stu.getName());
        System.out.println(String.format("Average:%.6f",stu.getAverage()));
        System.out.println("Grade:" +stu.getGrade());
    }
}