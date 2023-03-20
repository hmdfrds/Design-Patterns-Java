import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();

        Robot shape = null;
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n Finnaly no of Distinct Robot objects created: " + numOfDistinctRobots);

    }

    public static String getRandomColor() {
        int random = (new Random()).nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }

    }
}
