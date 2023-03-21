package State;

abstract class RemoteControl {
    public abstract void pressSwitch(TV content);

}

class On extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On .Going to be Off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am Off. Going to be On now");
        context.setState(new On());
    }
}
