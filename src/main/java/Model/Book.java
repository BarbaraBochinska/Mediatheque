package Model;

public class Book extends MediaItem implements Readable {

    public Book(String title, String author, int length, int releaseDate) {
        super(title, author, length, releaseDate);
    }

    @Override
    protected void preview(MediaItem mediaItem) {
        read();
    }


    @Override
    public void read() {

    }
}
