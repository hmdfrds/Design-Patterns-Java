public class Client {
    public static void main(String[] args) {

        System.out.println("Creating the Subject which is cricket subject");
        CricketData cricketData = new CricketData();

        System.out.println("Creating two Observers");
        Observer averageScore = new AverageScore();
        Observer currentScore = new CurrentScore();

        System.out.println("Make this two oberver subscribe to the subject\n");
        cricketData.register(currentScore);
        cricketData.register(averageScore);

        System.out.println("\nThe subject is sending something\n");
        cricketData.sendNotification(new StateData(4, 4, 2));

        System.out.println("\naverageScore observer is unscribing from the topic");
        cricketData.unRegister(averageScore);

        System.out.println("The Observer is sending new thing again\n");
        cricketData.sendNotification(new StateData(5, 6, 3));
    }
}
