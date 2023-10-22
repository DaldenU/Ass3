// Adapter to make Dragonborn compatible with ModernGamer
class DragonbornAdapter implements ModernGamer {
    private Dragonborn dragonborn;

    public DragonbornAdapter(Dragonborn dragonborn) {
        this.dragonborn = dragonborn;
    }

    @Override
    public void playModernGame() {
        System.out.println("Adapter: The Dragonborn is playing a modern game.");
        dragonborn.shoutFusRoDah();
    }
}