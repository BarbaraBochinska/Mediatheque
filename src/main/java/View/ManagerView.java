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
        System.out.println("1.Add item\n2.Delete item\n3.Back to privilage menu");
    }
}
