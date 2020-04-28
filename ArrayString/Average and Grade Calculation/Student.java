public class Student
{
    //int i;
    private int id;
    private String name;
    private int marks[];
    private float average;
    private char grade;
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMarks(int marks[])
    {
        this.marks = new int[marks.length];
        this.marks = marks;
    }
    public void setAverage(float average)
    {
        this.average = average;
    }
    public void setGrade( char grade)
    {
        this.grade = grade;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int[] getMarks()
    {
        return this.marks;
    }
    public float getAverage()
    {
        return average;
    }
    public char getGrade()
    {
        return grade;
    }
    public void calculateAvg()
    {
        float total = 0;
        int n = this.marks.length;
        int marks[] = this.getMarks();
        for(int i=0;i<n;i++)
        {
            total += this.marks[i];
        }
        this.average = total/n;
    }
    public void findGrade()
    {
        double average = this.average;
        int arr[] = this.marks;
        boolean flag = true;
        if(flag)
        {
            for(int i=0;i<arr.length;i++)
            {if(arr[i]<50)
             {
               this.grade='F';
               flag = false;
               break;
             }
                
            }
        }
        if(flag=true)
        {
            if(average>=80 && average<=100)
            {
                this.grade = 'O';
            }
            else if(average>=50 && average<80)
            {
                this.grade = 'A';
            }
            else
            {
                this.grade = 'F';
            }
        }
    }
}