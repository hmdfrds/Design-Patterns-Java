package State.Challenge;

interface Alert {
    void alertPhone();
}

class Vibrate implements Alert {

    @Override
    public void alertPhone() {
        System.out.println("brrrrrrr You got a new message");
    }

}

class Silent implements Alert {

    @Override
    public void alertPhone() {
        System.out.println("shhhhhh you got a new message");
    }

}