package Controller;

import Model.Warehouse;
import View.PrivilageMenuView;

public class MainController {

    private Warehouse warehouse = new Warehouse();
    private PrivilageMenuView privilageMenuView = new PrivilageMenuView();
    private UserController userController = new UserController(warehouse);
    private ManagerController managerController = new ManagerController(warehouse);
}
