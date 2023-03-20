
public class Client {
    public static void main(String[] args) {

        // create mediator and buyers
        Mediator auctionMediator = new AuctionMediator();
        Buyer buyer1 = new AuctionBuyer(auctionMediator, "Tal Baum");
        Buyer buyer2 = new AuctionBuyer(auctionMediator, "Elad Shamailov");
        Buyer buyer3 = new AuctionBuyer(auctionMediator, "John Smith");

        // add buyer to the mediator
        auctionMediator.addBuyers(buyer1);
        auctionMediator.addBuyers(buyer2);
        auctionMediator.addBuyers(buyer3);

        System.out.println(
                "Welcome to the auction. Tonight we are selling a vacation to Vegas. Please make some offers.");
        System.out.println("------------------------------------");
        System.out.println("Waiting oft the buyer's offers...");
        System.out.println("------------------------------------");

        // buyers is bidding
        buyer1.bid(1800);
        buyer2.bid(2000);
        buyer3.bid(1500);

        // mediator finding the hightst bidder
        auctionMediator.findHighestBidder();

        // some one cancelled his bid
        buyer2.cancelBid();

        // mediator inform that the auction is over
        auctionMediator.notifyAuctionEnded();

    }
}
