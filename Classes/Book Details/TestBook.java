import java.util.Scanner;

public class TestBook
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Book name:");
        String bookName = sc.nextLine();
        System.out.println("Enter the price:");
        int bookPrice =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Author name:");
        String bookAuthor =sc.nextLine();
        
        Book bookobj = new Book();
        bookobj.setBookName(bookName);
        bookobj.setBookPrice(bookPrice);
        bookobj.setAuthorName(bookAuthor);
        System.out.println("Book Details");
        System.out.println("Book Name :" +bookobj.getBookName());
        System.out.println("Book Price :" +bookobj.getBookPrice());
        System.out.println("Author Name :" +bookobj.getAuthorName());
    }
}