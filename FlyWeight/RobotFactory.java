import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    Map<String, RobotI> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotI getRobotFromFactory(String robotType) throws Exception {
        RobotI myRobot = null;
        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have a King Robot. So we are creating a King Robot.");
                    myRobot = new Robot("King");
                    break;
                case "Queen":
                    System.out.println("We do not have a Queen Robot. So ew are creating a Queen Robot");
                    myRobot = new Robot("Queen");
                    break;
                default:
                    throw new Exception("Robot Factory can create only King and Queen robot");

            }
        }
        shapes.put(robotType, myRobot);
        return myRobot;
    }
}
