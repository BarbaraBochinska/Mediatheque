package View;

import Model.MediaItem;

import java.util.List;
import java.util.Scanner;

public class ManagerView {

    public void showManagerView() {
        System.out.println("All media items:");
    }

    public void showItems(List<MediaItem> items) {
        System.out.println("No. | Title | Author | Length | Release Date | Availability | Category |");
        for (int i = 0; i < items.size() ; i++) {
            System.out.println(Integer.toString(i)  + items.get(i) + " " + items.get(i).getClass().getSimpleName());
        }
    }

    public int getChosenOption(){
        Scanner scan = new Scanner(System.in);
        String chosenOption = scan.nextLine();
        return Integer.parseInt(chosenOption);
    }

    public void showOptions() {
        System.out.println("\nOptions:");
        System.out.println("1.Add item\n2.Delete item");
    }

    public void showSecondOptionAdd() {
        System.out.println("What item do you want to add:");
        System.out.println("1.Book\n2.Movie\n3.Music");
    }

    public String getItemInfo() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public String getUserTitle() {
        System.out.println("Title:");
        return getItemInfo();
    }
    public String getUserAuthor() {
        System.out.println("Author:");
        return getItemInfo();
    }
    public String getUserLength() {
        System.out.println("Length:");
        return getItemInfo();
    }
    public String getUserReleaseDate() {
        System.out.println("Release Date:");
        return getItemInfo();
    }
}
