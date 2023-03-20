
interface Buyer {

    String getName();

    double getPrice();

    void bid(double price);

    void cancelBid();

    void notifyAuctionEnded();
}

abstract class BuyerImpl implements Buyer {
    protected Mediator mediator;
    protected String name;
    protected double price;

    public BuyerImpl(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.price = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public abstract void bid(double price);

    @Override
    public abstract void cancelBid();

    @Override
    public abstract void notifyAuctionEnded();
}

class AuctionBuyer extends BuyerImpl {

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(double price) {
        this.price = price;
    }

    @Override
    public void cancelBid() {
        this.price = 0;
        System.out.println(this.name + " Has canceled his bid!");
        if (mediator.getHigestBuyer() == this) {
            System.out.print(", In that case ");
            mediator.findHighestBidder();
        }

    }

    @Override
    public void notifyAuctionEnded() {
        System.out.println(this.name + " has been notified that the auction is over");
    }

}