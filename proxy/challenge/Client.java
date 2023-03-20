public class Client {

    public static void main(String[] args) {
        Internet internet = new InternetProxy("ban1.com");

        internet.connectToInternet();
        System.out.println("ConnectAgain");
        internet.connectToInternet();

    }
}
