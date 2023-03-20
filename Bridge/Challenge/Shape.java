
abstract class Shape {
    protected int border = 0;
    protected IColor color;

    public Shape(IColor color, int border) {
        this.color = color;
        this.border = border;
    }

    abstract void drawShapes();

    abstract void modifyBorders(int border);
}

class Triangle extends Shape {
    public Triangle(IColor color, int border) {
        super(color, border);

    }

    @Override
    public void drawShapes() {
        System.out.print("This Triangle Colored with: ");
        color.fillWithColor();
        System.out.println(" color with " + border + " inch border.");
    }

    @Override
    public void modifyBorders(int border) {
        super.border *= border;
        System.out.println("Now we are changing the border length " + border + " times");
    }
}

class Rectangle extends Shape {
    public Rectangle(IColor color, int border) {
        super(color, border);
    }

    @Override
    public void drawShapes() {
        System.out.print("This Triangle Colored with: ");
        color.fillWithColor();
        System.out.println(" color with " + border + " inch border.");
    }

    @Override
    public void modifyBorders(int border) {
        super.border *= border;
        System.out.println("Now we are changing the border length " + border + " times");
    }
}