public class CaptainSingletonTest {
    public static void main(String[] args) {

        System.out.println("Trying to make a captain for our team.");
        CaptainSingleton captain1 = CaptainSingleton.getInstance();

        System.out.println("Trying to make another captain for our team.");
        CaptainSingleton captain2 = CaptainSingleton.getInstance();

        if (captain1 == captain2) {
            System.out.println("You already have a Captain for your team. Send him for the toss.");
            System.out.println("c1 and c2 are same instance.");
        }

    }

}
