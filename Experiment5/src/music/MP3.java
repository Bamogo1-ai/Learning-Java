package music;

public class MP3 extends Audio {
    private int bitrate;

    public MP3(String title, int bitrate) {
        super(title);
        this.bitrate = bitrate;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3: " + title + " (Bitrate: " + bitrate + " kbps)");
    }

    @Override
    public String getInfo() {
        return "MP3 - " + title + " | Bitrate: " + bitrate + " kbps";
    }
}
