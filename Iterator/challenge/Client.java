public class Client {

    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Subject scienceSubject = new Science();
        Subject artsSubject = new Arts();

        Iterator scienceIterator = scienceSubject.createIterator();
        Iterator artsIterator = artsSubject.createIterator();

        System.out.println("\nScience subjects :");
        print(scienceIterator);

        System.out.println("\nArts subjects :");
        print(artsIterator);
    }

}
