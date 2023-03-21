package Visitor.Challenge;

public class Client {
    public static float calculateTotalPriceUS(Item[] items) {

        float total = 0;
        for (Item item : items) {
            total += item.accept(new USPostageVisitor());
        }
        return total;
    }

    public static float calculateTotalPriceSA(Item[] items) {

        float total = 0;
        for (Item item : items) {
            total += item.accept(new SouthAmericaPostageVisitor());
        }
        return total;
    }

    public static void main(String[] args) {
        Item[] items = new Item[] { new Book(3, 21), new DVD(1, 15), new CD(3, 15) };

        float totalPriceUS = calculateTotalPriceUS(items);
        float totalPriceSA = calculateTotalPriceSA(items);

        System.out.println("The total postage for shipping my items to the US is: " + totalPriceUS);

        System.out.println("The total postage for shipping my items to the SA is: " + totalPriceSA);

    }

}
