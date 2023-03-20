public interface Animal {
    void talk();
}

class Duck implements Animal {

    @Override
    public void talk() {
        System.out.println("Duck says Pack-pack");
    }
}

class Tiger implements Animal {

    @Override
    public void talk() {
        System.out.println("Tiget says: Halum..Halum");
    }
}