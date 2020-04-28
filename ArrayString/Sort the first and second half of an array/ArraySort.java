import java.util.*;
public class ArraySort
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int i;
        int m;
        //int a[] = new int[];
        int b[];
        int c[];
        if(n>0)
        {
            int a[] = new int[n];
            System.out.println("Enter the elements:");
            for(i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            
            if(n%2!=0)
            {
                m = (n+1)/2;
                b = new int[m];
                for(i=0;i<m;i++)
                {
                    b[i]=a[i];
                }
                
                c = new int[m]; 
                for(i=m;i<n;i++)
                {
                    c[i-m]=a[i];
                }
                
            }
            
            else
            {
                m=n/2;
                b=new int[m];
                for(i=0;i<m;i++)
                {
                    b[i]=a[i];
                }
                c= new int[m];
                for(i=m;i<n;i++)
                {
                    c[i-m]=a[i];
                }
            }
            Arrays.sort(b);
            for(i=0;i<b.length;i++)
            {
                System.out.println(b[i]);
            }
            Arrays.sort(c);
            for(i=c.length-1;i>0;i--)
            {
                System.out.println(c[i]);
            }
        }
        else if((n==0)||(n<0))
        {
            System.out.println("Array size should be greater then 0");
        }
    }
}