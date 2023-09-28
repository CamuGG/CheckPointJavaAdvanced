public abstract class Item {
    private int id;
    private double price;
    private int quantity;

    public boolean isAvailable() {
        return quantity > 0;
    }

    public Item(int id, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
