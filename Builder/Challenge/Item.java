interface Item {
    String getName();

    double getPrice();

    Packing getPacking();
}

abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}

abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}