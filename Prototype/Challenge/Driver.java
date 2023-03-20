public class Driver {
    public static void main(String[] args) {
        BasicCarCache basicCarCache = new BasicCarCache();
        basicCarCache.loadCar();

        BasicCar car1 = (BasicCar) basicCarCache.getCarCache("Ford");

        BasicCar car2 = (BasicCar) basicCarCache.getCarCache("Nano");

        System.out.println("Car is : " + car1.getModelName() + " and it's price is " + car1.getPrice());

        System.out.println("Car is : " + car2.getModelName() + " and it's price is " + car2.getPrice());

    }
}
