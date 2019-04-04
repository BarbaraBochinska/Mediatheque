package Model;

public class Movie extends MediaItem implements Watchable{

    public Movie(String title, String author, int length, int releaseDate) {
        super(title, author, length, releaseDate);
    }

    @Override
    protected void preview(MediaItem mediaItem) {
        watch();
    }


    @Override
    public void watch() {
        System.out.println();
    }

}
