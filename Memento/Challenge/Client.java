package Memento.Challenge;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.state = 1;
        originator.state = 2;
        careTaker.save(originator);
        originator.state = 3;
        originator.state = 4;
        careTaker.save(originator);
        originator.state = 5;
        originator.state = 6;

        System.out.println("Current State: State #" + originator.state);
        careTaker.getState(originator, 0);
        System.out.println("First saved State: State #" + originator.state);
        careTaker.getState(originator, 1);
        System.out.println("Second saved State: State #" + originator.state);

    }
}
