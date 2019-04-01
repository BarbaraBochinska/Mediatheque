package View;

import Model.MediaItem;

import java.util.List;
import java.util.Scanner;

public class UserView {

    public void showMainMenu() {
        System.out.println("Choose category to browse:");
        System.out.println("1.Books\n2.Movies\n3.Music");
        System.out.println("\n0.Quit");
    }

    public void showOptions(List<? extends  MediaItem> items) {
        System.out.println("\nOptions:");
        System.out.println("1.Search");
        System.out.println("2.Back to category");
    }

    public int getChosenOption(){
        Scanner scan = new Scanner(System.in);
        String chosenOption = scan.nextLine();
        return Integer.parseInt(chosenOption);
    }

    public void showItems(List<? extends MediaItem> items) {
        if (items.isEmpty()) {
            System.out.println("No items");
        }
        else {
            System.out.println("No. | Title | Author | Length | Release Date | Availability");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(Integer.toString(i) + items.get(i));
            }
        }
    }

    public void showSecondOptionSearch() {
        System.out.println("1.Search by title\n2.Search by author");
    }
}
