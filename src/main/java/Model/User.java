package Model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Warehouse warehouse;
    private ArrayList<MediaItem> rentedItems = new ArrayList<>();
    private ArrayList<MediaItem> reservedItems = new ArrayList<>();

    public User(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public ArrayList<MediaItem> searchItems(List<? extends MediaItem> items, String metaData, String field) {
        ArrayList<MediaItem> searchedItems = new ArrayList<>();
        switch (field) {
            case "title":
                for (int i = 0; i < items.size() ; i++) {
                    if (items.get(i).getTitle().equals(metaData)) {
                        searchedItems.add(items.get(i));
                    }
                }
                break;
            case "author":
                for (int i = 0; i < items.size() ; i++) {
                    if (items.get(i).getAuthor().equals(metaData)) {
                        searchedItems.add(items.get(i));
                    }
                }
                break;

        }
        return searchedItems;
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
