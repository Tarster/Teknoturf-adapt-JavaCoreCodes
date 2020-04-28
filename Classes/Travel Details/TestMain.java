import java.util.Scanner;

public class TestMain
{
    public static BusTicket getTicketDetails()
    {
        Person p = new Person();
        BusTicket bt = new BusTicket();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the passenger name:");
        String name = sc.next();
        p.setName(name);
        
        System.out.println("Enter the gender(M or F / m or f):");
        char gender = sc.next(".").charAt(0);
        p.setGender(gender);
        
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        p.setAge(age);
        
        bt.setPerson(p);
        
        System.out.println("Enter the ticket no:");
        int tno = sc.nextInt();
        bt.setTicketNo(tno);
        
        System.out.println("Enter the ticket price");
        float price = sc.nextFloat();
        bt.setTicketPrice(price);
        return bt;
    }
    public static void main (String[] args)
    {
        //Person person =busticket.getPerson();
        
        BusTicket busticket = getTicketDetails();
        
        Person person =busticket.getPerson();
        //int age = busticket.person.getAge();
        busticket.calculateTotal();
        System.out.println("Ticket no:" +busticket.getTicketNo());
        System.out.println("Passenger Name:" +person.getName());
        System.out.println("Price of ticket : " +busticket.getTicketPrice());
        System.out.println("Total Amount : " +busticket.getTotalAmount());
    }
}