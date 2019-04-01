package Controller;

import Model.User;
import Model.Warehouse;

public class UserController {

    private Warehouse warehouse;
    private User user;

    public UserController(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.user = new User(warehouse);
    }
}
