public class Book extends Item {
    private String ISBN;
    private String title;
    private int numberOfPage;

    public Book(int id, double price, int quantity, String ISBN, String title, int numberOfPage) {
        super(id, price, quantity);
        this.ISBN = ISBN;
        this.title = title;
        this.numberOfPage = numberOfPage;
    }
}
