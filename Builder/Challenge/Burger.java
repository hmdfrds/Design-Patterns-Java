class VegBurger extends Burger {

    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public double getPrice() {
        return 1.4;
    }
}

class ChickenBurger extends Burger {

    @Override
    public String getName() {
        return "ChickenBurger";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
