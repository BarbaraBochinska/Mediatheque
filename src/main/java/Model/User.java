package Model;

import java.util.ArrayList;

public class User {

    private Warehouse warehouse;
    private ArrayList<MediaItem> rentedItems = new ArrayList<>();
    private ArrayList<MediaItem> reservedItems = new ArrayList<>();

    public User(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void searchItem(MediaItem item) {
    }

    public void rentItem(MediaItem item) {
    }

    public void reserveItem(MediaItem item) {
    }

    public void returnItem(MediaItem item) {
    }

    public ArrayList<MediaItem> getRentedItems() {
        return rentedItems;
    }

    public ArrayList<MediaItem> getReservedItems() {
        return reservedItems;
    }
}
