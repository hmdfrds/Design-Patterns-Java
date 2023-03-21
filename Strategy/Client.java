package Strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        shoppingCart.addItem(item2);
        shoppingCart.addItem(item1);

        shoppingCart.pay(new PaypalStrategy("jason@gmail.com", "fdsafdsa"));

        shoppingCart.pay(new CreditCardStrategy("jason", "12341241", "4214", "2030/23/23"));
    }
}
