package Strategy.Challenge;

public class Calculator {
    int num1, num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculate(CalculateStragety calculateStragety) {
        calculateStragety.calculate(num1, num2);
    }

}
