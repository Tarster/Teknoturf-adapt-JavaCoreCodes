import java.util.Scanner;
public class Main
{
    public static Employee getEmployeeDetails()
    {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        System.out.println("Enter id:");
        int empId = sc.nextInt();
        obj.setEmployeeId(empId);
        sc.nextLine();
        System.out.println("Enter name:");
        String empName = sc.nextLine();
        obj.setEmployeeName(empName);
        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        obj.setSalary(salary);
        return obj;
        
    }
    public static int getPFPercentage()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter PF Percentage");
        int pf = sc.nextInt();
        return pf;
    }
    
    public static void main(String[] args)
    {
        Employee empobj = new Employee();
    empobj = getEmployeeDetails();
    int pf1 = getPFPercentage();
    empobj.calculateNetSalary(pf1);
    System.out.println("Id :" +empobj.getEmployeeId());
    System.out.println("Name :" +empobj.getEmployeeName());
    System.out.println("Salary :" +empobj.getSalary());
    System.out.println("Net Salary :" +empobj.getNetSalary());
}
}
