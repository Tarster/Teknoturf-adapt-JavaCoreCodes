import java.util.Scanner;
public class UniqueChar
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,z=0;
        int count =0;
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        char c[] = sentence.toCharArray();
        int temp[] = new int[c.length];
        for (i=0;i<c.length;i++ )
        {
            if((('a'<=c[i])&&(c[i]<='z')) || (('A'<=c[i]&&c[i]<='Z')) || (c[i]==' '))
            {
                
            }
            else 
            {
               System.out.println("Invalid Sentence");
               System.exit(0);
                break;
            }
        }
        char uniqueChar[] = new char[c.length];
        boolean flag;
        for(i=0;i<c.length;i++)
        {
            flag = true;
            for(j=0;j<c.length;j++)
            {
                //System.out.println("i:" +i+ " count:" +count+ " j" +j);
                //System.out.println("c[i]:" +c[i]+ " c[j]" +c[j] );
                if((c[i]==c[j] && i!=j) || c[i] == ' ')
                {
                    flag = false;
                    break;
                }
            }
            //System.out.println("flag:" +flag);
            if(flag)
            {
                uniqueChar[count] =c[i];
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Unique characters: ");
            for(i=0;i<count;i++)
            {
                System.out.println(uniqueChar[i]);
            }
        }
        else
        {
            System.out.println("No unique characters");
        }
    }
}