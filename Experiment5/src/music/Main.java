package music;

public class Main {
    public static void main(String[] args) {

        Audio[] playlist = {
            new MP3("Song One", 320),
            new WAV("Live Concert"),
            new FLAC("Classical Symphony")
        };

        MusicPlayer player = new MusicPlayer();
        player.playAll(playlist);
    }
}
