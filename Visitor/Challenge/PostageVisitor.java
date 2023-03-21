package Visitor.Challenge;

interface PostageVisitor {
    float visit(Book book);

    float visit(CD cd);

    float visit(DVD dvd);
}

class USPostageVisitor implements PostageVisitor {

    @Override
    public float visit(Book book) {
        if (book.getPrice() > 20) {
            return 0;
        }
        return book.getWeight() * 2;
    }

    @Override
    public float visit(CD cd) {
        if (cd.getPrice() > 20) {
            return 0;
        }
        return cd.getWeight() * 2.5f;
    }

    @Override
    public float visit(DVD dvd) {
        if (dvd.getPrice() > 20) {
            return 0;
        }
        return dvd.getWeight() * 3;
    }

}

class SouthAmericaPostageVisitor implements PostageVisitor {

    @Override
    public float visit(Book book) {
        if (book.getPrice() > 30) {
            return 0;
        }
        return book.getWeight() * 2 * 2;
    }

    @Override
    public float visit(CD cd) {
        if (cd.getPrice() > 30) {
            return 0;
        }
        return cd.getWeight() * 2.5f * 2;
    }

    @Override
    public float visit(DVD dvd) {
        if (dvd.getPrice() > 30) {
            return 0;
        }
        return dvd.getWeight() * 3 * 2;
    }

}