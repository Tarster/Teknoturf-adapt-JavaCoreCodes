public class Ticket
{
    private int ticketid;
    private int price;
    // int nooftickets;
    // int Totalamount;
    private static int availableTickets;
    
    public void setTicketid(int ticketid)
    {
        this.ticketid = ticketid;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    static public void setAvailableTickets(int anavailableTickets)
    {
        if(anavailableTickets>0)
        {
            availableTickets = anavailableTickets;
        }
    }
    
    public int calculateTicketCost(int nooftickets)
    {
        int totalAmount=0;
        
        if(availableTickets>=nooftickets)
        {
            availableTickets = availableTickets - nooftickets;
            totalAmount = nooftickets*price;
            return totalAmount;
            //System.out.println("Total amount:" + totalAmount);
        }
        else
        {
            return -1;
        }
        
        //return totalAmount;
    }
    
    public int getTicketid()
    {
        return ticketid;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    static public int getAvailableTickets()
    {
        return availableTickets;
    }
    
}