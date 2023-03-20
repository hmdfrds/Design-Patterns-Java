public class Client {
    public static void main(String[] args) {

        Decorator decorator1 = new RedShapeDecorator(new Circle());
        decorator1.draw();
        System.out.println("");
        Decorator decorator2 = new GreenShapeDecorator(new Rectangle());
        decorator2.draw();
    }
}
