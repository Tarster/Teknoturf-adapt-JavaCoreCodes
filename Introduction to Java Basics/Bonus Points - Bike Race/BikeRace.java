import java.util.Scanner;
public class BikeRace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int dis = sc.nextInt();
        int count = 0;
        int curdigit, dbonus;
        int oddproduct = 0;
        int evenproduct = 0;
        if(dis>=0)
        {
            while(dis!=0)
            {
                curdigit = dis%10;
                if(count==0)
                {
                    evenproduct = curdigit;
                }
                else if(count==1)
                {
                    oddproduct = curdigit;
                }
                else if(count%2==0)
                {
                    evenproduct = evenproduct*curdigit;
                }
                else
                {
                    oddproduct = oddproduct * curdigit;
                }
                count = count+1;
                dis = dis/10;
            }
            if(evenproduct>oddproduct)
            {
                System.out.println("Your bonus points is " +evenproduct);
            }
            else if(oddproduct>evenproduct)
            {
                System.out.println("Your bonus points is " +oddproduct);
            }
            else
            {
                dbonus = evenproduct*2;
                System.out.println("Your bonus points is " +dbonus);
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
            
    }
}