public class Client {

    public static void main(String[] args) {

        Animal animal1 = AnimalFactory.getAnimal("DUCK");
        animal1.talk();
        Animal animal2 = AnimalFactory.getAnimal("TIGET");
        animal2.talk();

    }
}
