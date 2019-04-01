package View;

import java.util.Scanner;

public class PrivilageMenuView {

    public void showPrivilegeMenu() {
        System.out.println("Welcome to Mediatheque!!!");
        System.out.println("Please choose privilege:");
        System.out.println("1.Manager\n2.User");
    }

    public int getChosenOption(){
        Scanner scan = new Scanner(System.in);
        String chosenOption = scan.nextLine();
        return Integer.parseInt(chosenOption);
    }
}
