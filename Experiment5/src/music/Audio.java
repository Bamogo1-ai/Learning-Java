package music;

public abstract class Audio {
    protected String title;

    public Audio(String title) {
        this.title = title;
    }

    public abstract void play();       // Méthode abstraite
    public abstract String getInfo();  // Détails audio
}
