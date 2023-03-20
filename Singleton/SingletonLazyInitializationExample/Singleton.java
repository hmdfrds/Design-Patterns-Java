package SingletonLazyInitializationExample;

public class Singleton {

    // the private reference ot the one and only intance
    private static Singleton uniqueInstantce = null;

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstantce == null) {
            uniqueInstantce = new Singleton();
        }
        return uniqueInstantce;
    }

    public void setData(int myData) {
        this.data = myData;
    }

    public int getData() {
        return data;

    }
}