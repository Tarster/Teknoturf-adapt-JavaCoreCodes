public class Student
{
    private int sid;
    private String sname;
    private Department department = new Department();
    public void setDepartment(Department department)
    {
        this.department.setDid(department.getDid());
        this.department.setDname(department.getDname());
    }
    public void setSid(int sid)
    {
        this.sid = sid;
    }
    public void setSname(String sname)
    {
        this.sname = sname;
    }
    public Department getDepartment()
    {
        return this.department;
    }
    public int getSid()
    {
        return sid;
    }
    public String getSname()
    {
        
        return sname;
    }
}