package problem1;

public class Book {

    private static double minPrice = 0.00;
    private static double maxPrice = 200.00;

    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.00;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = 0.00;     
        setPrice(price);        
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean setPrice(double price) {
        if (price >= minPrice && price <= maxPrice) {
            this.price = price;
            return true;
        }
        System.out.printf("Invalid price $%.2f. Price must be between $%.2f and $%.2f. "
                + "Price was not changed.%n", price, minPrice, maxPrice);
        return false;
    }

    public void show() {
        System.out.println("Title:  " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price:  $%.2f%n", price);
    }
}
