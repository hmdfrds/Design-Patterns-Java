public class Singleton {

    private static Singleton uniqueInstantce = new Singleton();

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstantce;
    }

    public void setData(int myData) {
        this.data = myData;
    }

    public int getData() {
        return data;

    }
}