package Strategy.Challenge;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5);

        calculator.calculate(new AddStrategy());
        calculator.calculate(new SubStrategy());
        calculator.calculate(new MultiStrategy());
    }
}
