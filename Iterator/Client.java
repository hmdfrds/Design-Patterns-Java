public class Client {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();

        NotificationBar rb = new NotificationBar(nc);
        rb.printNotification();

    }

}
