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

    public String toString() {
        return " | " + title + " | " + author + " | " + length + " | " + releaseDate + " | " + itemAvailability + " | ";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getId() {
        return id;
    }

    public ItemAvailability getItemAvailability() {
        return itemAvailability;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
