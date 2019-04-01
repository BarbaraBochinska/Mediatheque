package Controller;

import Model.MediaItem;
import Model.User;
import Model.Warehouse;
import View.UserView;

import java.util.List;

public class UserController {

    private UserView userView = new UserView();
    private Warehouse warehouse;
    private User user;

    public UserController(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.user = new User(warehouse);
    }

    public void showUserMainMenu() {
        userView.showMainMenu();
        int chosenCategory = userView.getChosenOption();
        showBrowseViewByChosenCategory(chosenCategory);
    }

    private void showBrowseViewByChosenCategory(int chosenCategory) {
        switch (chosenCategory) {
            case 1:
                showBrowseView(warehouse.getBooks());
                break;
            case 2:
                showBrowseView(warehouse.getMovies());
                break;
            case 3:
                showBrowseView(warehouse.getMusic());
                break;
            case 0:
                System.exit(0);
            default:
                throw new IllegalArgumentException("No such category.");

        }
    }

    private void showBrowseView(List<? extends MediaItem> items) {
        userView.showItems(items);
        userView.showOptions(items);
        int chosenAction = userView.getChosenOption();
        showWindowByChosenAction(chosenAction, items);
    }

    private void showWindowByChosenAction(int chosenAction, List<? extends MediaItem> items) {
        switch (chosenAction) {
            case 1:
                userView.showSecondOptionSearch();
                int searchBy = userView.getChosenOption();
                break;
            case 2:
                showUserMainMenu();
                break;
            default:
                throw new IllegalArgumentException("No such category.");
        }
    }
}
