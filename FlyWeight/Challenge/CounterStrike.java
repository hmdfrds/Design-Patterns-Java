import java.util.Random;

public class CounterStrike {
    public static void main(String[] args) throws Exception {
        PlayerFacotry playerFacotry = new PlayerFacotry();

        Player player = null;
        for (int i = 0; i < 5; i++) {
            player = (Terrorist) playerFacotry.getPlayer("Terrorist");
            player.assignWeapon(getRamdomWeapon());
            player.mission();
        }

        for (int i = 0; i < 5; i++) {
            player = (CounterTerrorist) playerFacotry.getPlayer("CounterTerrorist");
            player.assignWeapon(getRamdomWeapon());
            player.mission();
        }
    }

    static String getRamdomWeapon() {
        int randomNumber = (new Random()).nextInt(20);
        if (randomNumber % 2 == 0) {
            return "Eagle";
        } else {
            return "Shotgun";
        }
    }

}
