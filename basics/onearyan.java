// Exercise 1:
// Now it's your turn to create a similar class. Try this exercise:

// Create a class named Book with the following attributes:

// title (String)
// author (String)
// price (double)
// Add a constructor to initialize these attributes.

// Add a method displayDetails() that prints the book details.

// In the main method, create an object of the Book class and call the displayDetails() method.

// Try this out and share your code or any questions you face!


public class onearyan {
    String title;
    String author;
    double price;

    public onearyan(String title,String author,double price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displayInfo(){
        System.out.println("Title of book:  "+this.title+"\nAuthor of book: "+this.author+"\nPrice of book: "+this.price);
    }
    
    public static void main(String[] args) {
        onearyan book1=new onearyan("The Alchemist","Paulo Coelho",200);
        book1.displayInfo();
    }
}