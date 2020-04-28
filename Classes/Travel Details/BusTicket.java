public class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person =new Person();
    //float ticketprice;
    //Person person = new Person();
    public void setPerson(Person person)
    {
        this.person.setName(person.getName());
        this.person.setGender(person.getGender());
        this.person.setAge(person.getAge());
    }
    
    public void setTicketNo( int ticketNo)
    {
        this.ticketNo= ticketNo;
    }
    
    public void setTicketPrice(float ticketprice)
    {
        this.ticketPrice=ticketprice;
    }
    
    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount=totalAmount;
    }

    public Person getPerson()
    {
        return this.person;
    }
        
    public int getTicketNo()
    {
        return this.ticketNo;
    }
    
    public float getTicketPrice()
    {
        return this.ticketPrice;
    }
    
    public float getTotalAmount()
    {
        return this.totalAmount;
    }
    

    
    
    public void calculateTotal()
    {float total;
     int age=this.person.getAge();
        if (age<16)
        {
            total= this.ticketPrice - (this.ticketPrice*0.5f);
            this.setTotalAmount(total);
        }
        else if (age>=60)
        {
            total = this.ticketPrice - (this.ticketPrice*0.25f);
            this.setTotalAmount(total);
        }
        else if(person.getGender()=='F' || person.getGender()=='f')
        {
            total =this.ticketPrice -(this.ticketPrice*0.1f);
            this.setTotalAmount(total);
        }
        else
        {
            total=this.ticketPrice;
            this.setTotalAmount(total);
        }
    }
}