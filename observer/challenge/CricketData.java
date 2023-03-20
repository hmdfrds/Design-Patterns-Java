import java.util.ArrayList;

interface Subject {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyListener();
}

class CricketData implements Subject {
    ArrayList<Observer> observers;
    StateData stateData;
    boolean dataChanged = false;

    public CricketData() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            return;
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyListener() {
        ArrayList<Observer> observersLocal = null;
        if (!dataChanged)
            return;

        observersLocal = new ArrayList<>(this.observers);
        for (Observer observer : observersLocal) {
            observer.update(stateData);
        }
        dataChanged = false;
    }

    public void sendNotification(StateData stateData) {
        this.stateData = stateData;
        dataChanged = true;
        notifyListener();
    }

}