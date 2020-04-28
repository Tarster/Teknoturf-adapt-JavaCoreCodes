public class Student
{
    private int studentId;
    private String studentName, studentAddress, collegeName;
    public Student(int studentId,String studentName,String studentAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        collegeName = "NIT";
        System.out.println("Student id:" +studentId);
        System.out.println("Student name:" +studentName);
        System.out.println("Address:" +studentAddress);
        System.out.println("College name:" +collegeName);
    }
    public Student(int studentId, String studentName, String studentAddress,String collegeName)
    {
        this.studentId= studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
        System.out.println("Student id:" +studentId);
        System.out.println("Student name:" +studentName);
        System.out.println("Address:" +studentAddress);
        System.out.println("College name:" +collegeName);
    }
    public int getStudentId()
    {
        return studentId;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public String getStudentAddress()
    {
        return studentAddress;
    }
    public String getCollegeName()
    {
        return collegeName;
    }
}