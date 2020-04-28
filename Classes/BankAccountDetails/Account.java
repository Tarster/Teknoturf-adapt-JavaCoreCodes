public class Account
{
    private int accountId;
    private String accountType;
    private int balance;
    public void setAccountId(int accountId)
    {
        this.accountId=accountId;
    }
    public void setAccountType(String accountType)
    {
        this.accountType=accountType;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public int getAccountId()
    {
        return accountId;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public int getBalance()
    {
        return balance;
    }
    public boolean withdraw(int withdrawamount)
    {
        if(this.balance>withdrawamount)
        {
            int bal = this.balance - withdrawamount;
            setBalance(bal);
            //System.out.println("Balance amount after withdraw:" +this.balance);
            return true;
        }
        else
        {
           // System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}