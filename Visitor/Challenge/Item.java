package Visitor.Challenge;

interface Item {
    float accept(PostageVisitor postageVisitor);
}

class Book implements Item {
    private int Weight;
    private int price;

    public Book(int weight, int price) {
        this.Weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return Weight;
    }

    @Override
    public float accept(PostageVisitor postageVisitor) {
        return postageVisitor.visit(this);
    }

    public int getPrice() {
        return price;
    }
}

class CD implements Item {
    private int Weight;
    private int price;

    public CD(int weight, int price) {
        this.price = price;
        this.Weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return Weight;
    }

    @Override
    public float accept(PostageVisitor postageVisitor) {
        return postageVisitor.visit(this);
    }
}

class DVD implements Item {
    private int Weight;
    private int price;

    public DVD(int weight, int price) {
        this.price = price;
        this.Weight = weight;
    }

    public int getWeight() {
        return Weight;
    }

    @Override
    public float accept(PostageVisitor postageVisitor) {
        return postageVisitor.visit(this);
    }

    public int getPrice() {
        return price;
    }
}
