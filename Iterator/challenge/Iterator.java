import java.util.LinkedList;

interface Iterator {
    // reset to the first element
    void first();

    // get next element
    String next();

    // end of collection check
    boolean isDone();

    // retrieve current item
    String currentItem();
}

class ArtsIterator implements Iterator {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public String next() {
        return subjects[position++];
    }

    public boolean isDone() {
        return position >= subjects.length;
    }

    public String currentItem() {
        return subjects[position];
    }
}

class ScienceIterator implements Iterator {
    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;
    }

    public void first() {
        position = 0;
    }

    public String next() {
        return subjects.get(position++);
    }

    public boolean isDone() {
        return position >= subjects.size();
    }

    public String currentItem() {
        return subjects.get(position);
    }
}