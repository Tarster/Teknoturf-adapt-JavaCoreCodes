import java.util.Scanner;
public class AccountDetails
{
    public static Account getAccountDetails()
    {
        int bal = 0;
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("Enter account id:");
        int id = sc.nextInt();
        acc.setAccountId(id);
        System.out.println("Enter account type:");
        String type = sc.next();
        acc.setAccountType(type);
        int z =0;
        while(z==0)
        {
        System.out.println("Enter balance:");
         bal = sc.nextInt();
        if(bal>0)
        {
            acc.setBalance(bal);
            z=1;
        }
        else
        {
            System.out.println("Balance should be positive");
        }
        }
        //acc.setBalance(bal);
        return acc;
    }
    public static int getWithdrawAmount()
    {
        Scanner sc = new Scanner(System.in);
        int z = 0;
        int wda=0;
        while(z==0)
        {
           System.out.println("Enter withdraw amount:");
           wda = sc.nextInt();
        if(wda>0)
        {
            //return wda;
            z=1;
        }
        else
        {
            System.out.println("Amount should be positive");
        }
        }
        return wda;
    }
    public static void main (String[] args) {
        Account account = new Account();
        account = getAccountDetails();
        int withdrawamount = getWithdrawAmount();
        //account.withdraw(withdrawamount);
        boolean ans = account.withdraw(withdrawamount);
        if(ans == true)
        {
            System.out.println("Balance amount after withdraw: " +account.getBalance());
        }
        else
        {
            System.out.println("Sorry!!! No enough balance");
        }
    }
}