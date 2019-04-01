package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private Warehouse warehouse;
    private User user;

    @BeforeEach
    void setUp() {
        this.warehouse = new Warehouse();
        this.user = new User(warehouse);
    }

    @AfterEach
    void tearDown() {
        warehouse = null;
        user = null;
    }

    @Test
    void searchItems() {
        Music item1 = new Music("Animals", "Pink Floyd", 75, 1970);
        ArrayList<Music> musicList = warehouse.getMusic();
        ArrayList<Music> newMusicList = new ArrayList<>();
        newMusicList.add(item1);
        String title = "Animals";
        assertEquals(newMusicList, user.searchItems(musicList, title, "title"));
    }
}