package State;

public class Client {
    public static void main(String[] args) {
        Off initialState = new Off();

        TV tv = new TV(initialState);

        tv.pressButton();

        tv.pressButton();
    }
}
