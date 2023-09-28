public class Shoe extends Item {
    private String brand;
    private String model;
    private int shoeNumber;

    public Shoe(int id, double price, int quantity, String brand, String model, int shoeNumber) {
        super(id, price, quantity);
        this.brand = brand;
        this.model = model;
        this.shoeNumber = shoeNumber;
    }
}
