package Template.Challenge;

public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate orderProcessTemplate = new NetOrder();

        orderProcessTemplate.processOrder();

        orderProcessTemplate = new StoreOrder();

        orderProcessTemplate.processOrder();
    }
}
