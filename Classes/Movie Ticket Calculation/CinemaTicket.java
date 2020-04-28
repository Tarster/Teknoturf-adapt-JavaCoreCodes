import java.util.Scanner;
public class CinemaTicket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int kingRate =75;
        final int queenRate=150;
        final int refreshmentPrice =50;
        final int couponDiscount =2;
        final int bulkDiscount =10;
        char inputCoupon,inputRefreshment,inputCircle;
        int numberOfTicket=0;
        int discountPercentage=0;
        double discountAmount=0.0;
        double totalPrice=0.0;
        System.out.println("Enter the no of ticket:");
        numberOfTicket = sc.nextInt();
        
        if (numberOfTicket>4 && numberOfTicket<41)
        {
        System.out.println("Do you want refreshment: ");
        inputRefreshment = sc.next(".").charAt(0);
        System.out.println("Do you have coupon code:");
        inputCoupon = sc.next(".").charAt(0);
        System.out.println("Enter the circle:");
        inputCircle = sc.next(".").charAt(0);
            if(numberOfTicket>20)
                discountPercentage += bulkDiscount;
            
            if (inputCoupon == 'y')
                discountPercentage += couponDiscount;
                
            if(inputCircle == 'k')
            {
                totalPrice +=(numberOfTicket * kingRate);
            }
            else if(inputCircle == 'q')
            {
                totalPrice+=(numberOfTicket * queenRate);
            }
            
            else
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            
            discountAmount =discountPercentage *0.01* totalPrice;
            totalPrice -=discountAmount;
            
            if(inputRefreshment == 'y')
                totalPrice += (numberOfTicket * refreshmentPrice);
            System.out.format("Ticket cost : %.2f", totalPrice);
            
        }
        
        else
        {
           System.out.println("Minimum of 5 and Maximum of 40 Tickets"); 
        }
    }
}