import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void addBuyers(Buyer buyer);

    void findHighestBidder();

    Buyer getHigestBuyer();

    void notifyAuctionEnded();
}

class AuctionMediator implements Mediator {
    private List<Buyer> buyers;
    private Buyer highestBuyer;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyers(Buyer buyer) {

        buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        highestBuyer = buyers.get(0);
        for (Buyer b : buyers) {
            if (b.getPrice() > highestBuyer.getPrice()) {
                highestBuyer = b;
            }
        }

        System.out.println("The auction winner is " + highestBuyer.getName());
        System.out.println("He paid " + highestBuyer.getPrice() + "$ for the item.");
    }

    @Override
    public Buyer getHigestBuyer() {
        return highestBuyer;
    }

    @Override
    public void notifyAuctionEnded() {
        for (Buyer b : this.buyers) {
            b.notifyAuctionEnded();
        }
    }

}