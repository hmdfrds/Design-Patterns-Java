package State.Challenge;

public class Phone {
    Alert state;

    public Phone(Alert alert) {
        this.state = alert;
    }

    public void setState(Alert alert) {
        this.state = alert;
    }

    public void receiveNewMessage() {
        state.alertPhone();
    }
}
