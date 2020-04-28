import java.util.Scanner;
import java.lang.String;
public class Character
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String spell="";
        System.out.println("Enter the first letter:");
        String one = sc.next();
        spell= spell.concat(one);
        System.out.println("Enter the second letter:");
        String two =  sc.next();
        spell = spell.concat(two);
        System.out.println("Enter the third letter:");
        String three = sc.next();
        spell = spell.concat(three);
        System.out.println("Enter the fourth letter:");
        String four = sc.next();
        spell = spell.concat(four);
        System.out.println("Enter the fifth letter:");
        String five = sc.next();
        spell = spell.concat(five);
        System.out.println("Enter the sixth letter:");
        String six = sc.next();
        spell = spell.concat(six);
        System.out.println("Enter the seventh letter:");
        String seven = sc.next();
        spell = spell.concat(seven);
        if(spell.equals("RAINBOW"))
        {
            System.out.println("RAINBOW");
        }
        else
        {
            System.out.println("The spelling is wrong");
        }
    }
}