interface Expression {
    boolean interpret(Context context);
}

class TerminalExpresison implements Expression {
    private String data;

    public TerminalExpresison(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);
    }

}
