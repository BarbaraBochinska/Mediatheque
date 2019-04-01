package Model;

public class Manager extends User {

    private Warehouse warehouse;

    public Manager(Warehouse warehouse) {
        super(warehouse);
        this.warehouse = warehouse;
    }

    public void addItem(MediaItem item) {
        if (item instanceof Book) {
            warehouse.books.add((Book)item);
        }
        else if (item instanceof Movie) {
            warehouse.movies.add((Movie)item);
        }
        else {
            warehouse.music.add((Music) item);
        }
    }

    public void removeItem(int item) {
        MediaItem itemToDelete = warehouse.getAllItems().get(item);
        if (itemToDelete instanceof Book) {
            warehouse.books.remove(itemToDelete);
        }
        else if (itemToDelete instanceof Movie) {
            warehouse.movies.remove(itemToDelete);
        }
        else if (itemToDelete instanceof Music) {
            warehouse.music.remove(itemToDelete);
        }
    }

    public void editItem(MediaItem item) {
    }
}
