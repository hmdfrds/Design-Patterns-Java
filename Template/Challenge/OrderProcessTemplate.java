package Template.Challenge;

abstract class OrderProcessTemplate {
    public final void processOrder() {
        doSelect();
        doPayment();
        delivery();
    }

    abstract void doSelect();

    abstract void doPayment();

    abstract void delivery();
}

class NetOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Selecting Item Netly");
    }

    @Override
    void doPayment() {
        System.out.println("Paying the Item Netly");

    }

    @Override
    void delivery() {
        System.out.println("Item otw");

    }
}

class StoreOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Selecting Item with hand");
    }

    @Override
    void doPayment() {
        System.out.println("Paying the Item f2f");

    }

    @Override
    void delivery() {
        System.out.println("You got the item i guess");

    }
}