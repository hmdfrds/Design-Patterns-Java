
interface IColor {
    void fillWithColor();
}

class RedCircle implements IColor {
    @Override
    public void fillWithColor() {
        System.out.print("Red");
    }
}

class GreenCircle implements IColor {
    @Override
    public void fillWithColor() {
        System.out.print("Green");
    }
}