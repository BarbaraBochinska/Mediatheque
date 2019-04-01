package Model;

public abstract class MediaItem {
    private String title;
    private String author;
    private int length;
    private int releaseDate;
    private int id;
    private static int counter = 0;
    private ItemAvailability itemAvailability;

    public MediaItem(String title, String author, int length, int releaseDate) {
        this.author = author;
        this.length = length;
        this.releaseDate = releaseDate;
        this.title = title;
        this.id = counter++;
        this.itemAvailability = ItemAvailability.AVAILABLE;
    }
}
