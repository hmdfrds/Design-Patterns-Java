
public class Client {
    public static void main(String[] args) {

        AbstractFactory bollywoodFactory = FactoryProducer.getFactory("bolly");

        BollywoodMovie bollywoodMovie1 = bollywoodFactory.getBollywoodMovie("action");
        bollywoodMovie1.getMovieName();

        BollywoodMovie bollywoodMovie2 = bollywoodFactory.getBollywoodMovie("comedy");
        bollywoodMovie2.getMovieName();

        AbstractFactory hollywoodFactory = FactoryProducer.getFactory("holly");

        HollywoodMovie hollywoodMovie1 = hollywoodFactory.getHollywoodMovie("action");
        hollywoodMovie1.getMovieName();

        HollywoodMovie hollywoodMovie2 = hollywoodFactory.getHollywoodMovie("comedy");

        hollywoodMovie2.getMovieName();
    }
}
