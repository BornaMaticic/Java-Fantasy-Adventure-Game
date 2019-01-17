package Game;

import Enemies.Enemy;
import Enemies.EnemyType;
import Players.Fighters.Knight;
import Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Knight knight;
    Enemy weakEnemy, strongEnemy;
    Room weakRoom, strongRoom;
    Game playerWinsGame, playerLosesGame;

    @Before
    public void beforeEach(){
        knight = new Knight("Sir Bornaverie", 5, 10, 2);
        weakEnemy = new Enemy(EnemyType.SQUIRREL);
        strongEnemy = new Enemy(EnemyType.ORC);
        weakRoom = new Room(weakEnemy);
        strongRoom = new Room(strongEnemy);

        playerWinsGame = new Game(knight, weakRoom);
        playerLosesGame = new Game(knight, strongRoom);
    }

    @Test
    public void battleWon() {
        assertEquals(knight, playerWinsGame.battle());
    }

    @Test
    public void battleLost() {
        assertEquals(strongEnemy, playerLosesGame.battle());
    }h


}