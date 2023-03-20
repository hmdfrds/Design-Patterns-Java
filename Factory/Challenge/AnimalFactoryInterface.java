public abstract class AnimalFactoryInterface {
    public abstract Animal getAnimal(String animalType) throws Exception;
}

class ConcreteFactore extends AnimalFactoryInterface {

    @Override
    public Animal getAnimal(String animalType) throws Exception {

        switch (animalType.toLowerCase()) {

            case "duck":
                return new Duck();
            case "tiger":
                return new Tiger();
            default:
                throw new Exception("There is no animal with " + animalType + " type.");
        }
    }
}