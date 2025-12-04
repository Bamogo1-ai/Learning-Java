package mediastreaming;

public class MediaTest {
    public static void main(String[] args) {

        Movie movie = new Movie("Inception");
        Podcast podcast = new Podcast("Tech Talks Daily");

        // Movie tests
        movie.play();
        movie.stream();
        movie.download();
        System.out.println(movie.getMediaInfo());

        System.out.println();

        // Podcast tests
        podcast.play();
        podcast.stream();
        System.out.println(podcast.getMediaInfo());
    }
}

