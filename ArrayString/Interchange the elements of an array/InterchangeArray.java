import java.util.Scanner;
public class InterchangeArray
{
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int sizeofFirstarr, sizeofsecondarr,i;
            int a[];
            int b[];
            
            System.out.println("Enter the number of elements in the first array:");
            sizeofFirstarr = sc.nextInt();
            if(sizeofFirstarr<1)
            {
                System.out.println("Invalid range");
                System.exit(0);
            }
            a= new int[sizeofFirstarr];
            System.out.println("Enter the elements in the first array");
            for(i=0;i<sizeofFirstarr;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the number of elements in the second array");
            sizeofsecondarr = sc.nextInt();
            if(sizeofsecondarr<1)
            {
                System.out.println("Invalid range");
                System.exit(0);
            }
            b= new int[sizeofsecondarr];
           // System.out.println("Enter the elements in the second array:");
           // for(i=0;i<sizeofsecondarr;i++)
           // {
             //   b[i] = sc.nextInt();
            //}
                    if(sizeofsecondarr == sizeofFirstarr)
                    {
                        System.out.println("Enter the elements in the second array:");
                        for(i=0;i<sizeofsecondarr;i++)
                        {
                            b[i] =sc.nextInt();
                        }
                    for(i=0; i<sizeofFirstarr; i++)
                    {
                        a[i] = a[i] + b[i];
                        b[i] = a[i] - b[i];
                        a[i] = a[i] - b[i];
                    }
                    System.out.println("The first array after swapping is :");
                    for(i=0; i<sizeofFirstarr; i++)
                    {
                        System.out.println(a[i] + " ");
                    }
                    System.out.println("The second array after swapping is :");
                    for(i=0;i<sizeofsecondarr; i++)
                    {
                        System.out.println(b[i] + " ");
                    }
                    }
                
                    else
                    {
                       System.out.println("Unable to swap size differs");
                    }
}
}