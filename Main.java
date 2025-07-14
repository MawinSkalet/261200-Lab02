public class Main{
    public static void main(String[] args) {
        // Test default constructor
        Book mybook = new Book("Book 1","Jirasak",5.0);
        mybook.displayDetails();

        System.out.println();

        // Test parameterized constructor
        Book ourbook = new Book("Ourbook");
        ourbook.displayDetails();
        ourbook.updatePrice(100.0);
        ourbook.displayDetails();

        System.out.println("===================");

        //TEST default constructor
        Book unknownBook = new Book();
        unknownBook.displayDetails();x
        //Test parameterized constructor
        Book hp1Book = new Book("Harry potter and the Philos");
        hp1Book.displayDetails();

        hp1Book.updatePrice(100000.0);
        hp1Book.displayDetails();
        hp1Book.updatePrice(-10000000.0); //show validation in negative update price
        hp1Book.applyDiscount(00.00);
        hp1Book.applyDiscount(25.00);

        System.out.println("===================");
        hp1Book.displayDetails();

    }
}