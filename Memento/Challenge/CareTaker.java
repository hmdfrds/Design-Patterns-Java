package Memento.Challenge;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Object> mementoList;

    public CareTaker() {
        mementoList = new ArrayList<>();
    }

    public void save(Originator originator) {
        mementoList.add(originator.save());
    }

    public void undo(Originator originator) {
        if (mementoList.size() > 0) {
            originator.undo(mementoList.remove(mementoList.size() - 1));
        }
    }

    public void getState(Originator originator, int index) {
        if (mementoList.get(index) != null) {
            originator.undo(mementoList.get(index));
        }
    }

    public void printState(Originator originator) {
        System.out.println("States Saved");
        for (Object object : mementoList) {
            originator.printState(object);
        }
    }

}
