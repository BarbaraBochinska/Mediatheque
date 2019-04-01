import Controller.MainController;

public class Mediatheque {

    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.createItems();
        controller.showPrivilegeMenu();
    }
}
