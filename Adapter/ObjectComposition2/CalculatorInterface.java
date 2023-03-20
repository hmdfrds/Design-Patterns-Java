interface CalculatorInterface {
    // target interface
    double getArea(Rectangle rectangle);
}

class Calculator implements CalculatorInterface {
    Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return this.rectangle.length * this.rectangle.width;
    }
}