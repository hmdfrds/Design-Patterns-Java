class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public double getPrice() {
        return 3.2;
    }
}

class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public double getPrice() {
        return 2.1;
    }
}