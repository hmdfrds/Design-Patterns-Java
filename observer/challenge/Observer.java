interface Observer {
    void update(StateData stateData);
}

class AverageScore implements Observer {

    @Override
    public void update(StateData stateData) {
        double runRate = stateData.run / stateData.overs;
        double predictedScore = runRate * 50;

        System.out.println("\nAverage Score Display");
        System.out.println("Run Rate : " + runRate);
        System.out.println("Predicted Score: " + predictedScore);
    }

}

class CurrentScore implements Observer {

    public void update(StateData stateData) {
        System.out.println("\nCurrent Score Display");
        System.out.println("Runs :" + stateData.run);
        System.out.println("Wickets :" + stateData.wickets);
        System.out.println("Overs :" + stateData.overs);
    }
}