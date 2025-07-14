// Book class represents a book with title, author, and price
public class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor: sets default values
    Book() {
        this("Unknown title", "Unknown author", 0.0);
    }

    // Constructor with only title parameter
    // Other fields are set to default values
    Book(String title){
        this(title, "Unknown Author", 0.0);
    }

    // Parameterized constructor: initializes all fields
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
    }

    // Method to update the book's price with validation
    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            // Reject negative prices
            System.out.println("Error: Price cannot be negative. Current price remains $" + this.price);
        } else {
            // Update and print the price change
            double oldPrice = this.price;
            this.price = newPrice;
            System.out.println("Price updated from $" + oldPrice + " to $" + this.price);
        }
    }
    public void applyDiscount(double discountpercentage){
        if(discountpercentage>0.00&&discountpercentage<100.00){
            double oldPrice = this.price ;
            double discountAmount = this.price*(discountpercentage/100.0);
            this.price = this.price - discountAmount ;
            System.out.println("Price discount " + discountpercentage +"%"+ "("+discountAmount+")"+" updated from $" + oldPrice + " to $" + this.price);
        }else {
            System.out.println("Error: Invalid discount percentage. Must be greater than 0.00 and less than 100.00."+ this.price);
        }
    }
}
