import java.util.Scanner;
public class TestMain
{
    public static Student createStudent()
    {
        Department dep= new Department();
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Department id:");
        int id = sc.nextInt();
        dep.setDid(id);
        System.out.println("Enter the Department name:");
        String dname = sc.next();
        dep.setDname(dname);
        stu.setDepartment(dep);
        System.out.println("Enter the Student id:");
        int sid = sc.nextInt();
        stu.setSid(sid);
        System.out.println("Enter the Student name:");
        String sname = sc.next();
        stu.setSname(sname);
        
        return stu;
    }
    public static void main (String[] args)
    {
        Student stud = new Student();
        Department dept = new Department();
        stud = createStudent();
        dept = stud.getDepartment();
        System.out.println("Department id:"  +dept.getDid());
        System.out.println("Department name:" +dept.getDname());
        System.out.println("Student id:" +stud.getSid());
        System.out.println("Student name:" +stud.getSname());
    }
}