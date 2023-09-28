public class Smartphone extends Item {
    private String IMEI;
    private String brand;
    private String model;

    public Smartphone(int id, double price, int quantity, String IMEI, String brand, String model) {
        super(id, price, quantity);
        this.IMEI = IMEI;
        this.brand = brand;
        this.model = model;
    }
}
