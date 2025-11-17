package music;

public class WAV extends Audio {

    public WAV(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing WAV: " + title + " (Lossless format)");
    }

    @Override
    public String getInfo() {
        return "WAV - " + title + " | Lossless format";
    }
}
