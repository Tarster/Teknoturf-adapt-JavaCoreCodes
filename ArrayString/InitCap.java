import java.util.Scanner;
public class InitCap
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int z=0;
        System.out.println("Enter the String:");
        String string = sc.nextLine();
        Scanner linescan = new Scanner(string);
        String Upperline = "";
        //String word = linescan.next();
        while (linescan.hasNext())
        {
            String word = linescan.next();
            boolean ans = Character.isLowerCase(word.charAt(0));
            if(ans == true)
            {
                Upperline += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
               z=1;
            }
            else 
            {
                Upperline += word + " ";
                z=0;
            }
        }
        if(z==1)
        {
           System.out.println(Upperline);
        }
        else
        {
            System.out.println("First character of each word is already in uppercase");
        }
    }
}