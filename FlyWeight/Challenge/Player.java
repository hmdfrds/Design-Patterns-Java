interface Player {
    void assignWeapon(String weapon);

    void mission();
}

class Terrorist implements Player {
    String task;
    String weapon;

    public Terrorist(String task) {
        this.task = task;
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist is: " + task + ". You can use your " + weapon);
    }

}

class CounterTerrorist implements Player {
    String task;
    String weapon;

    public CounterTerrorist(String task) {
        this.task = task;
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("CounterTerrorist Mission is: " + task + ". You can use your " + weapon);
    }

}