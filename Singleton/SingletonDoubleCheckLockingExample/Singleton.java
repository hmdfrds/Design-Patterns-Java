public class Singleton {

    private volatile static Singleton uniqueInstantce = null;

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstantce == null) {
            synchronized (Singleton.class) {
                if (uniqueInstantce == null) {
                    uniqueInstantce = new Singleton();
                }
            }

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