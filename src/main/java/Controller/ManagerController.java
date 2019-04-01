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
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new IllegalArgumentException("No such category.");
        }
    }


}
