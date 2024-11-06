
// Implement classes Book and Librarian with simple attributes like title and name, 
// along with methods to display their details.
// In the Library class, create instances of Book and Librarian and display their details through the Library's method.
import java.util.ArrayList;
class books{

    private String title;

    books(String Name){
        this.title=Name;
    }

    void info(){
        System.out.println("NAME OF THE BOOK:\t"+this.title);
    }
}
class librarian{
    private String Name;
    librarian(String Name){
        this.Name=Name;
    }
    void info(){
        System.out.println("This library is managed by"+this.Name);
    }
}
class library{
    private ArrayList<books> lbooks;
    private librarian lname;
    library(librarian lname){
        this.lbooks=new ArrayList<books>();
        this.lname=lname;
    }
    void displaybooks(){
        System.out.println("WE HAVE GOT THESE BOOKS HERE:-");
        for(int i=0;i<lbooks.size();i++){
            System.out.print(i+1+" ");
            this.lbooks.get(i).info();
        }
        System.out.println();
    }
    void addBooks(books b1){
        this.lbooks.add(b1);
    }
    void info(){
        System.out.println("LIBRARY INFO: ");
        displaybooks();
        lname.info();
    }
}
public class ninearyan {
    public static void main(String[] args) {


        librarian x=new librarian("SUNEETA");
        library iiitd=new library(x);
        iiitd.info();

        books b1=new books("THE ALCHEMIST");
        books b2=new books("THE FOURTH WAY");
        iiitd.addBooks(b1);
        iiitd.addBooks(b2);
        iiitd.info();

        
    }
}
