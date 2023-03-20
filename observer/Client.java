public class Client {
    public static void main(String[] args) {

        // create subject
        MyTopic topic = new MyTopic();

        // create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        // register observers to the subject, could have added the registration as part
        // of the observer constructor.
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // attach observer to subject ( not required, oculd have passed in subject state
        // to update method)

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // check if any update is available, not required
        obj1.update();

        topic.postMessage("New Message");
    }

}
