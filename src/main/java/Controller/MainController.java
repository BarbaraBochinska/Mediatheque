package Controller;

import Model.Book;
import Model.Movie;
import Model.Music;
import Model.Warehouse;
import View.PrivilageMenuView;

public class MainController {

    private Warehouse warehouse = new Warehouse();
    private PrivilageMenuView privilageMenuView = new PrivilageMenuView();
    private UserController userController = new UserController(warehouse);
    private ManagerController managerController = new ManagerController(warehouse);

    public void showPrivilegeMenu() {
        privilageMenuView.showPrivilegeMenu();
        int chosenCategory = privilageMenuView.getChosenOption();
        showMenuByPrivilege(chosenCategory);
    }

    private void showMenuByPrivilege(int chosenCategory) {
        switch (chosenCategory) {
            case 1:
                managerController.showManagerView();
                break;
            case 2:
                userController.showUserMainMenu();
                break;
        }
    }

    public void createItems() {
        Book item = new Book("Harry Potter part I", "J. K. Rowling.", 235, 1999);
        Book item2 = new Book("Harry Potter part II", "J. K. Rowling.", 335, 1999);
        Book item3 = new Book("Harry Potter part III", "J. K. Rowling.", 439, 1999);
        Music item4 = new Music("Equinoxe", "Jean-Michel Jarre", 60, 1980);
        Music item5 = new Music("Invisible Touch", "Genesis",66, 1985);
        Music item6 = new Music("Animals", "Pink Floyd", 75, 1970);
        Movie item7 = new Movie("Shrek", "DreamWorks", 180, 2001);
        Movie item8 = new Movie("Shawshank Redemption", "Frank Darabont", 230, 1998);
        Movie item9 = new Movie("Wreck it Ralph", "Disney",120, 2012);
        warehouse.saveItem(item);
        warehouse.saveItem(item2);
        warehouse.saveItem(item3);
        warehouse.saveItem(item4);
        warehouse.saveItem(item5);
        warehouse.saveItem(item6);
        warehouse.saveItem(item7);
        warehouse.saveItem(item8);
        warehouse.saveItem(item9);
    }
}
