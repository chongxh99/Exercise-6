import java.util.Scanner;
public class TestBook 
{
    public static void main (String [] args) 
    {
        Scanner scan = new Scanner(System.in);
        String title, expensive="";
        double price=0, highestPrice=0;

        System.out.print("Enter the number of books: ");
        int b = scan.nextInt();
        
        Book [] myLibrary = new Book[b];

        for (int i=0; i<b; i++)
        {
            scan.nextLine();
            System.out.print("Book Title: ");
            title = scan.nextLine();
            System.out.print("Book Price: ");
            price = scan.nextDouble();

            myLibrary[i] = new Book(title,price);
            if (myLibrary[i].getPrice()>highestPrice)
            {
                highestPrice = myLibrary[i].getPrice();
                expensive = myLibrary[i].getTitle();
            }
        }
            System.out.println ("The most expensive book is : "+ expensive + " with the price of RM " + price);
            System.out.println("The books with the word 'Java' in their title is : ");
        
        for(int j=0; j<b; j++)
        {
            if(myLibrary[j].getTitle().indexOf("Java")!=-1)
               System.out.println(myLibrary[j].getTitle());
        }

    }
}

class Book {
    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
        title = t;
        price = p;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
