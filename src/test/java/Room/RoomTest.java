package Room;

import Enemies.Enemy;
import Enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Room room;
    Enemy enemy;

    @Before
    public void setUp(){
        enemy = new Enemy(EnemyType.CHARMELON);
        room = new Room(enemy);
    }

    @Test
    public void getEnemy() {
        assertEquals(enemy, room.getEnemy());
    }
}