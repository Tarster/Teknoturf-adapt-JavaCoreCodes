import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Ticket tick = new Ticket();
        int numberOfBooking;
        int ticketPrice=-1;
        
        System.out.println("Enter no of bookings:");
        numberOfBooking = sc.nextInt();
        System.out.println("Enter the available tickets:");
        int ticket = sc.nextInt();
        tick.setAvailableTickets(ticket);
        for(int i=0;i<numberOfBooking;i++)
            {    
                System.out.println("Enter the ticketid:");
                int id = sc.nextInt();
                tick.setTicketid(id);
        
                System.out.println("Enter the price:");
                int price = sc.nextInt();
                tick.setPrice(price);
        
                System.out.println("Enter the no of tickets:");
                int noof = sc.nextInt();
                
                ticketPrice=tick.calculateTicketCost(noof);
                
                System.out.println("Available tickets: " +(tick.getAvailableTickets() + noof));
                System.out.println("Total amount:"+ticketPrice);
                System.out.println("Available ticket after booking:" +tick.getAvailableTickets());
            }        
        
    }
}