package Model;

public class Music extends MediaItem implements Listenable{

    public Music(String title, String author, int length, int releaseDate) {
        super(title, author, length, releaseDate);
    }

    @Override
    protected void preview(MediaItem mediaItem) {
        listen();
    }

    @Override
    public void listen() {

    }
}
