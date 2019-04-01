package Controller;

import Model.Manager;
import Model.Warehouse;
import View.ManagerView;

public class ManagerController {

    private Warehouse warehouse;
    private ManagerView managerView = new ManagerView();
    private Manager manager;

    ManagerController(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.manager = new Manager(warehouse);
    }
}
