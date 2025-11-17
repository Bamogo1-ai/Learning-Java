package music;

public class FLAC extends Audio {

    public FLAC(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC: " + title + " (High-definition lossless)");
    }

    @Override
    public String getInfo() {
        return "FLAC - " + title + " | High-definition lossless";
    }
}
