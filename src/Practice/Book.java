package Practice;

public class Book
{
    String Title;
    String Author;
    double Price;

    //Constructor
    Book()
    {
        Title = "Habits";
        Author = "Hardi Virani";
        Price = 5.00;
    }

    //Parameterised Constructor
    Book(String newT, String newA, double newP)
    {
        Title = newT;
        Author = newA;
        Price = newP;
    }

    //Method
    public void displaydetails()
    {
        System.out.println("Title: "+Title);
        System.out.println("Author: "+Author);
        System.out.println("Price: "+Price);
    }

     public static void main(String[]args)
     {
         System.out.println("Default Book");
         Book defaulBook = new Book();
         defaulBook.displaydetails();
         System.out.println();
         System.out.println("Custom Book");
         Book customBook = new Book("Legend", "Mann Savani" , 99.00);
         customBook.displaydetails();
     }
}
