import java.util.Scanner;
public class DuplicateElement
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,no=0;
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        if(size<1)
        {
            System.out.println("Invalid array size");
            System.exit(0);
        }
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position of the element to be replicated:");
        int pos = sc.nextInt();
        if(pos>=size)
        {
            System.out.println("Position is greater than the size of an array");
            System.exit(0);
        }
        else
        {
            for(i=0;i<size;i++)
            {
                if(i==pos)
                {
                    no = arr[i];
                    break;
                }
            }
        }
        int arr1[] = new int[size+1];
        for(i=0;i<size;i++)
        {
            arr1[i] = arr[i];
        }
        arr1[size] = no;
        for(i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}