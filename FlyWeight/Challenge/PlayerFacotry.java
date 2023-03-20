import java.util.HashMap;
import java.util.Map;

class PlayerFacotry {
    private Map<String, Player> playerMap = new HashMap<>();

    public Player getPlayer(String playerType) throws Exception {

        Player player = null;

        if (playerMap.containsKey(playerType)) {
            player = playerMap.get(playerType);
        } else {
            switch (playerType) {
                case "Terrorist":
                    System.out.println("We do not have a Terrorist. So we are creating a Terrorist");
                    player = new Terrorist("Planting bomb");
                    break;
                case "CounterTerrorist":
                    System.out.println("We do not have a Counter Terrorist. So we are creating a Counter Terrorist");
                    player = new CounterTerrorist("Kill all Terrorist of Defuse the bomb");
                    break;
                default:
                    throw new Exception("We can only create terrorist and counter terrorist");
            }
            playerMap.put(playerType, player);
        }
        return player;
    }
}
