package Model;

public class Manager extends User {

    private Warehouse warehouse;

    public Manager(Warehouse warehouse) {
        super(warehouse);
        this.warehouse = warehouse;
    }

    public void addItem(MediaItem item) {
    }

    public void removeItem(MediaItem item) {
    }

    public void editItem(MediaItem item) {
    }
}
