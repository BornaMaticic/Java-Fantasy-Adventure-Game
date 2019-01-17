package Game;

import Enemies.Enemy;
import Enemies.EnemyType;
import Items.Weapon;
import Items.WeaponType;
import Players.Fighters.Knight;
import Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Knight knight, betterKnight, betterKnightClone;
    Enemy weakEnemy, strongEnemy;
    Room weakRoom, strongRoom;
    Game playerWinsGame, playerLosesGame, betterPlayerLosesWithoutWeapon, betterPlayerWinsWithWeapon;;
    Weapon weapon;

    @Before
    public void beforeEach(){
        knight = new Knight("Sir Bornaverie", 5, 10, 2);
        betterKnight = new Knight("Sir Wishart", 1, 28, 2);
        betterKnightClone = new Knight("Sir Wishart", 1, 28, 2);
        weakEnemy = new Enemy(EnemyType.SQUIRREL);
        strongEnemy = new Enemy(EnemyType.ORC);
        weakRoom = new Room(weakEnemy);
        strongRoom = new Room(strongEnemy);
        weapon = new Weapon(WeaponType.AXE);

        playerWinsGame = new Game(knight, weakRoom);
        playerLosesGame = new Game(knight, strongRoom);
        betterPlayerLosesWithoutWeapon = new Game(betterKnight, strongRoom);
        betterKnightClone.pickUpWeapon(weapon);
        betterPlayerWinsWithWeapon = new Game(betterKnightClone, strongRoom);
    }

    @Test
    public void battleWon() {
        assertEquals(knight, playerWinsGame.battle());
    }

    @Test
    public void battleLost() {
        assertEquals(strongEnemy, playerLosesGame.battle());
    }

    @Test
    public void battleWonWithoutWeapon() {
        assertEquals(strongEnemy, betterPlayerLosesWithoutWeapon.battle());
    }

    @Test
    public void battleWonWithWeapon() {
        assertEquals(betterKnightClone, betterPlayerWinsWithWeapon.battle());
    }


}