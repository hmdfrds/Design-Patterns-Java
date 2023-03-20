interface Expression {
    String interpret(InterpretorContext interpretorContext);
}

class IntToBinarryExpression implements Expression {
    private int i;

    public IntToBinarryExpression(int i) {
        this.i = i;
    }

    public String interpret(InterpretorContext interpretorContext) {
        return interpretorContext.getBinaryFormat(i);
    }
}

class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int i) {
        this.i = i;
    }

    public String interpret(InterpretorContext interpretorContext) {
        return interpretorContext.getHexadecimalFormat(i);
    }
}