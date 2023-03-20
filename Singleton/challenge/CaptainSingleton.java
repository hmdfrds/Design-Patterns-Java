public class CaptainSingleton {

    private int data = 0;

    private CaptainSingleton() {
    }

    public static class CaptainSingletonHelper {
        public static CaptainSingleton captainSingleton = new CaptainSingleton();
    }

    public static CaptainSingleton getInstance() {
        return CaptainSingletonHelper.captainSingleton;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

}