package music;

public class MusicPlayer {

    public void playAll(Audio[] audios) {
        for (Audio audio : audios) {
            audio.play();  // Appel polymorphique
        }
    }
}
