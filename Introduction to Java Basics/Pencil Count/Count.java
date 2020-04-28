import  java.util.Scanner;

class Count{
    
    public static void main (String[] args) 
    {
        
        int standard =0;
        int pencil =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the standard:");
        standard = sc.nextInt();
        
        if(standard>=1 && standard <= 12)
            {
                for(int i=1;i<=standard;i++)
                {
                   pencil += i*i;
                }
        
                System.out.println("Nila gets " + pencil + " pencils" );
    
            }
            
        else 
        {
            System.out.println("Invalid Standard");
        }
   }
}