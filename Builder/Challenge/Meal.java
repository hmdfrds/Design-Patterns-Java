import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> itemList;
    private double cost = 0;

    public Meal() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double getCost() {
        for (Item item : itemList) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.println(
                    "Item : " + item.getName() + ", Packing : " + item.getPacking().pack() + ", Price: "
                            + item.getPrice());
        }
        System.out.println("Total Cost: " + getCost());

    }
}
