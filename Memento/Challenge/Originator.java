package Memento.Challenge;

public class Originator {
    public int state;

    public Originator() {
        state = 0;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void undo(Object obj) {
        Memento memento = (Memento) obj;
        this.state = memento.state;
    }

    public void printState(Object obj) {
        Memento memento = (Memento) obj;
        System.out.println(memento.state);
    }

    private class Memento {
        int state;

        public Memento(int state) {
            this.state = state;
        }
    }
}
