 class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
 class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}
public class Main2 {
    public static void main(String[] args) {

        Author author = new Author("James Gosling", "james@gmail.com", 'M');

        Book book = new Book("Java Programming", author, 650.50, 20);

        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity in Stock : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("--------------");
        System.out.println("Name : " + book.getAuthor().getName());
        System.out.println("Email : " + book.getAuthor().getEmail());
        System.out.println("Gender : " + book.getAuthor().getGender());
    }
}