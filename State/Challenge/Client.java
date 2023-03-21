package State.Challenge;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone(new Vibrate());

        phone.receiveNewMessage();

        phone.setState(new Silent());

        phone.receiveNewMessage();
    }
}
