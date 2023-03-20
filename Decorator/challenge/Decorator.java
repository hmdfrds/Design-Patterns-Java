abstract class Decorator implements Shape {
    Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }
}

class RedShapeDecorator extends Decorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Fill is with Red");
    }
}

class GreenShapeDecorator extends Decorator {

    public GreenShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Fill is with Green");
    }
}