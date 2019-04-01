package Model;

public class Music extends MediaItem {

    public Music(String title, String author, int length, int releaseDate) {
        super(title, author, length, releaseDate);
    }

    public void listenTo(Music music) {
    }
}
