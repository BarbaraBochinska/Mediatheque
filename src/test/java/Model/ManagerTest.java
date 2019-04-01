package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private Warehouse warehouse;
    private Manager manager;

    @BeforeEach
    void setUp() {
        this.warehouse = new Warehouse();
        this.manager = new Manager(warehouse);
    }

    @AfterEach
    void tearDown() {
        warehouse = null;
        manager = null;
    }

    @Test
    void addItem() {
        Music music = new Music("Sting", "Album", 90, 2000);
        int itemId = music.getId();
        manager.addItem(music);
        assertEquals(music, warehouse.music.get(itemId));
    }

    @Test
    void removeItem() {
        Music music = new Music("Sting", "Album", 90, 2000);
        manager.addItem(music);
        manager.removeItem(0);
        assertTrue(warehouse.music.isEmpty());
    }
}