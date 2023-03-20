abstract class BasicCar implements Cloneable {
    String modelName;
    double price = 0;

    abstract void accelerate();

    public String getModelName() {
        return modelName;
    }

    public void setName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}

class Nano extends BasicCar {

    public Nano() {
        this.modelName = "Nano";
        this.price = 100000.0;
    }

    public void accelerate() {
        System.out.println("brooom");
    }

    @Override
    public Nano clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }

}

class Ford extends BasicCar {

    public Ford() {
        this.modelName = "Ford";
        this.price = 40000.0;
    }

    public void accelerate() {
        System.out.println("brimmm");
    }

    @Override
    public Ford clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }

}