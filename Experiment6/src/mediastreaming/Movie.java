package mediastreaming;

class Movie extends Media implements Streamable, Downloadable {

    public Movie(String title) {
        super(title);
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + title);
    }

    @Override
    public String getMediaInfo() {
        return "Movie Title: " + title;
    }

    @Override
    public void stream() {
        System.out.println("Streaming movie in 4K quality");
    }

    @Override
    public void download() {
        System.out.println("Downloading movie: " + title);
    }
}
