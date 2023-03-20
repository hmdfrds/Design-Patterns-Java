abstract class AbstractDecorator extends Component {
    protected Component com;

    public void SetTheComponent(Component component) {
        com = component;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx_1 extends AbstractDecorator {
    public void doJob() {

        super.doJob();
        // add aditional responsibilities
        System.out.println("I am explicity from Ex_1");
    }
}

class ConcreteDecoratorEx_2 extends AbstractDecorator {
    public void doJob() {
        System.out.println("");
        System.out.println("'***START Ex-2***");
        super.doJob();
        // add aditional responsibilities
        System.out.println("Explicity from Ex_2");
        System.out.println("***END. EX-2");
    }
}