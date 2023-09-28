import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private List<Item> items;

    public void addToCart(Item item) throws IsAvailableException {
        if (!item.isAvailable()) {
            throw new IsAvailableException("this " + item.getClass().getSimpleName() + " is not available");
        }
        item.setQuantity(item.getQuantity() - 1);
        items.add(item);
    }

    public ShoppingCart(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }
}
