package mediastreaming;


class Podcast extends Media implements Streamable {

    public Podcast(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + title);
    }

    @Override
    public String getMediaInfo() {
        return "Podcast Title: " + title;
    }

    @Override
    public void stream() {
        System.out.println("Streaming podcast in high quality");
    }
}
