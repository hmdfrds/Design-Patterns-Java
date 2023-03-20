
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        switch (choice.toLowerCase()) {
            case "bolly":
                return new BollywoodMovieFactory();
            case "holly":
                return new HollywoodMovieFactory();
            default:
                return null;
        }
    }
}
