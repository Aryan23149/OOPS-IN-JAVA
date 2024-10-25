public class product {
    private double price;
    product(){
        this.price=0;
    }
    product(double p){
        this.price=p;
    }
    void displayPrice(){
        System.out.println("PRICE: "+this.price);
    }
    double getPrice(){
        return this.price;
    }
    void changePrice(double np){
        this.price=np;
        return;
    }
}
// Let’s extend your Book class using inheritance.

// Create a parent class Product with attributes price and a method displayPrice().
// Have your Book class extend the Product class.
// Move the price attribute and changePrice() method to the Product class.
// Override the displayPrice() method in the Book class to show book-specific price details.
// Give it a try and share your results!
