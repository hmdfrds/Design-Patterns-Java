package Strategy.Challenge;

interface CalculateStragety {
    void calculate(int num1, int num2);
}

class AddStrategy implements CalculateStragety {

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

class SubStrategy implements CalculateStragety {

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
}

class MultiStrategy implements CalculateStragety {

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
}