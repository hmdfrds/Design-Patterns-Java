public class Client {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Order order1 = new BuyStock(new Stock("Google", 100));
        broker.takeOrder(order1);
        Order order2 = new SellStock(new Stock("Google", 100));
        broker.takeOrder(order2);
        broker.placeOrders();
    }
}
