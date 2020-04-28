import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Numerology
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        Pattern pattern  = Pattern.compile("[A-Z]*");
        Matcher matcher = pattern.matcher(name);
        if(!matcher.matches())
        {
            System.out.println("Invalid name");
        }
        else
        {
            String[][] n = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},{"1","2","3","4","5","8","3","5","1","1","2","3","4","5","7","8","1","2","3","4","6","6","6","5","1","7"}};
            int[] num = new int[26];
            for(int i=0;i<26;i++)
            {
                num[i] = Integer.parseInt(n[1][i]);
            }
            String[] sname = name.split("");
            int nn = 0;
            for(int i=0;i<sname.length;i++)
            {
                for(int j=0;j<26;j++)
                {
                    if(sname[i].equals(n[0][j]))
                    {
                        nn = nn+num[j];
                        //System.out.println(nn);
                        break;
                        
                    }
                }//System.out.println(nn);
            }
            System.out.println("Your numerology no is:" +nn);
            
        }
    }
}