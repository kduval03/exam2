package problem1;

public class Driver {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.show();
        
        Book book2 = new Book("Discrete Mathematics", "Sagullo", 150.75);
        book2.show();

        Book book3 = new Book("Calculus II", "Stewart", 250.00);
        book3.show();

        book1.setTitle("Java Programming");
        book1.setAuthor("Hightower");
        book1.setPrice(89.99);
        System.out.println("Title:  " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price:  $" + book1.getPrice());
        
        book1.setPrice(-5.00);     
        book1.setPrice(200.01);     
        book1.setPrice(0.00);       
        System.out.println("After setPrice(0.00):   $" + book1.getPrice());
        book1.setPrice(200.00);  
        System.out.println("After setPrice(200.00): $" + book1.getPrice());
        book1.setPrice(300.00);    
        System.out.println("After setPrice(300.00): $" + book1.getPrice());
        
        book1.show();
    }
}