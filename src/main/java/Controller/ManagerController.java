package Controller;

import Model.*;
import View.ManagerView;

public class ManagerController {

    private Warehouse warehouse;
    private ManagerView managerView = new ManagerView();
    private Manager manager;

    ManagerController(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.manager = new Manager(warehouse);
    }

    void showManagerView() {
        managerView.showManagerView();
        managerView.showItems(warehouse.getAllItems());
        managerView.showOptions();
        int managerAction = managerView.getChosenOption();
        chooseManagerAction(managerAction);
    }

    private void chooseManagerAction(int managerAction) {
        switch (managerAction) {
            case 1:
                managerView.showSecondOptionAdd();
                int chosenSecondOption = managerView.getChosenOption();
                chooseCategoryItemToAdd(chosenSecondOption);
                break;
            case 2:
                int itemToDelete = managerView.getSecondOptionDelete();
                manager.removeItem(itemToDelete);
                showManagerView();
                break;
            default:
                throw new IllegalArgumentException("No such category.");
        }
    }

    private void chooseCategoryItemToAdd(int chosenSecondOption) {
        String title = managerView.getUserTitle();
        String author = managerView.getUserAuthor();
        String length = managerView.getUserLength();
        String releaseDate = managerView.getUserReleaseDate();
        switch (chosenSecondOption) {
            case 1:
            case 2:
            case 3:
                createItem(title, author, length, releaseDate, chosenSecondOption);
                showManagerView();
                break;
            default:
                throw new IllegalArgumentException("No such option");

        }
    }

    private void createItem(String title, String author, String length, String releaseDate, int category) {
        MediaItem newItem = null;
        if (category == 1) {
            newItem = new Book(title, author, Integer.parseInt(length), Integer.parseInt(releaseDate));
        }
        else if (category == 2) {
            newItem = new Movie(title, author, Integer.parseInt(length), Integer.parseInt(releaseDate));
        }
        else if (category == 3){
            newItem = new Music(title, author, Integer.parseInt(length), Integer.parseInt(releaseDate));
        }
        manager.addItem(newItem);
    }


}
