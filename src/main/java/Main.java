public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart1 = new ShoppingCart(123);
        ShoppingCart shoppingCart2 = new ShoppingCart(456);

        Book book1 = new Book(159219, 15.50, 3, "vbiubviu", "jvsbivsi", 569);
        Book book2 = new Book(15999, 15.50, 3, "vbiubviu", "jvsbivsi", 569);

        Smartphone smartphone1 = new Smartphone(999, 250, 3, "nwijbv", "veiuvbe", "viuebn");

        Shoe shoe1 = new Shoe(693, 65, 6, "vbiusb", "vbiusw", 43);
        Shoe shoe2 = new Shoe(693, 65, 6, "vbiusb", "vbiusw", 43);
        Shoe shoe3 = new Shoe(693, 65, 6, "vbiusb", "vbiusw", 43);

        try {
            shoppingCart1.addToCart(book1);
            shoppingCart1.addToCart(book2);
            shoppingCart1.addToCart(shoe1);
            shoppingCart2.addToCart(smartphone1);
            shoppingCart2.addToCart(shoe2);
            shoppingCart2.addToCart(shoe3);
        } catch (IsAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
