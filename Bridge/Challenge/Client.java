public class Client {
    public static void main(String[] args) {
        System.out.println("Coloring Triangle :");
        Shape shape1 = new Triangle(new GreenCircle(), 20);
        shape1.drawShapes();
        shape1.modifyBorders(3);
        shape1.drawShapes();

        System.out.println("\nColoring Rectangle :");
        Shape shape2 = new Rectangle(new RedCircle(), 50);
        shape2.drawShapes();
        shape2.modifyBorders(2);
        shape2.drawShapes();
    }
}
