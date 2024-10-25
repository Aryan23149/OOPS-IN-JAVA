public class twoaryan {
    private String title;
    private String author;
    private double price;

    public twoaryan(String title,String author,double price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    String whoIsAuthor(){
        return this.author;
    }
    String bookName(){
        return this.title;
    }
    double howMuchIsThePrice(){
        return this.price;
    }
    void changePrice(double new_price){
        if(new_price<0){
            return;
        }
        this.price=new_price;
    }
    void displayInfo(){
        System.out.println("Title of book:  "+this.title+"\nAuthor of book: "+this.author+"\nPrice of book: "+this.price);
    }
    
    
    public static void main(String[] args) {
        twoaryan book1=new twoaryan("The Alchemist","Paulo Coelho",200);
        book1.displayInfo();
        System.out.println(book1.whoIsAuthor());
        System.out.println(book1.howMuchIsThePrice());
        System.out.println(book1.bookName());
        book1.changePrice(1000);
        System.out.println(book1.howMuchIsThePrice());
    }
}
// Now, apply the concept of encapsulation to your Book class:

// Change the attributes (title, author, price) to private.
// Add public getter methods for each attribute.
// Add a setter method for price that allows modifying the price, but only if the new price is positive.