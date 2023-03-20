public class Singleton {
 

    private static Singleton uniqueInstantce = null;

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
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