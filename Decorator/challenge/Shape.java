interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}