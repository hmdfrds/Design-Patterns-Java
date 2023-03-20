import java.util.Hashtable;

public class BasicCarCache {
    private Hashtable<String, Object> hashtable = new Hashtable<>();

    public Object getCarCache(String modelName) {
        return hashtable.get(modelName);
    }

    public void loadCar() {
        BasicCar nanoCar = new Nano();

        BasicCar fordCar = new Ford();
        hashtable.put(nanoCar.getModelName(), nanoCar);
        hashtable.put(fordCar.getModelName(), fordCar);

    }

}
