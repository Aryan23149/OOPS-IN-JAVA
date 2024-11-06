// Dependency is a relationship where one class uses another to perform a certain action. Unlike association, aggregation, 
// or composition,
//  a dependency is usually a temporary link, where a class relies on another class only 
//  during the execution of specific methods, and the 
//  relationship doesn’t imply ownership or a permanent connection.

// For example:

// When you call a method of another class within a method in your class, you’re creating a dependency.
// Dependency can be a one-way relationship, meaning one class depends on another without needing to retain its state.
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer {
    // Dependency on Document class
    public void printDocument(Document doc) {
        System.out.println("Printing document content: " + doc.getContent());
    }
}

public class twelvegpt {
    public static void main(String[] args) {
        Document doc = new Document("OOP Dependency Example");
        Printer printer = new Printer();
        printer.printDocument(doc); // Dependency occurs here
    }
}
// Key Points About Dependency
// Temporary Link: Dependency is usually temporary, existing only within the scope of a method where the class interacts with another class.
// Loose Coupling: It’s a loosely coupled relationship, meaning that the classes don’t need each other to exist, which makes dependency 
//the least restrictive class relationship.
// No Ownership: Dependency implies no ownership, unlike composition or aggregation.
