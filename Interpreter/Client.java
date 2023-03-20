public class Client {
    public InterpretorContext interpretorContext;

    public Client(InterpretorContext interpretorContext) {
        this.interpretorContext = interpretorContext;
    }

    public String interpret(String string) {
        Expression ext = null;

        // perform the passing
        if (string.contains("Hexadecimal")) {
            ext = new IntToHexExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else if (string.contains("Binary")) {
            ext = new IntToBinarryExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else {
            return string;
        }
        return ext.interpret(interpretorContext);
    }

    public static void main(String[] args) {
        String str1 = "28 in Hexadecimal";
        String str2 = "28 in Binary";

        Client client = new Client(new InterpretorContext());

        System.out.println(client.interpret(str1));

        System.out.println(client.interpret(str2));

    }
}
