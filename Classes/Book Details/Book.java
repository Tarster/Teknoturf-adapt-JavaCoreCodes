public class Book
{
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    public void setBookName(String name)
    {
      this.bookName = name;
    }
    public void setBookPrice(int price)
    {
        this.bookPrice = price;
    }
    public void setAuthorName(String name1)
    {
        this.authorName = name1;
    }
    public String getBookName()
    {
        return this.bookName;
    }
    public int getBookPrice()
    {
        return this.bookPrice;
    }
    public String getAuthorName()
    {
        return this.authorName;
    }
    
}