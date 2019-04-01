package Model;

import java.util.ArrayList;

public class Warehouse {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Music> music = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Music> getMusic() {
        return music;
    }

    public void saveItem(MediaItem item) {
        if (item instanceof Book) {
            books.add((Book)item);
        }
        else if (item instanceof Movie) {
            movies.add((Movie)item);
        }
        else {
            music.add((Music) item);
        }
    }

    public ArrayList<MediaItem> getAllItems() {
        ArrayList<MediaItem> allItems = new ArrayList<>();
        allItems.addAll(books);
        allItems.addAll(movies);
        allItems.addAll(music);
        return allItems;
    }
}
