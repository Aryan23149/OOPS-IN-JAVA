public class book extends product{
    private String title;
    private String author;
    public book(String title,String author,double price) {
        super(price);
        this.title=title;
        this.author=author;
    }
    String whoIsAuthor(){
        return this.author;
    }
    String bookName(){
        return this.title;
    }
    double howMuchIsThePrice(){
        return this.getPrice();
    }
    void changeBookPrice(double new_price){
        if(new_price<0){
            return;
        }
        changePrice(new_price);
    }
    void displayInfo(){
        System.out.println("Title of book:  "+this.title+"\nAuthor of book: "+this.author+"\nPrice of book: "+this.getPrice());
    }
    
    
    public static void main(String[] args) {
        book book1=new book("The Alchemist","Paulo Coelho",200);
        book1.displayInfo();
        System.out.println(book1.whoIsAuthor());
        System.out.println(book1.howMuchIsThePrice());
        System.out.println(book1.bookName());
        book1.changePrice(1000);
        System.out.println(book1.howMuchIsThePrice());
    }
}
