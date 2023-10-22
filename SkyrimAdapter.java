// Client code
public class SkyrimAdapter {
    public static void main(String[] args) {
        Dragonborn dragonborn = new Dragonborn();
        ModernGamer modernGamer = new DragonbornAdapter(dragonborn);

        modernGamer.playModernGame();
    }
}
