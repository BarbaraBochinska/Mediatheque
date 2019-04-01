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
}
