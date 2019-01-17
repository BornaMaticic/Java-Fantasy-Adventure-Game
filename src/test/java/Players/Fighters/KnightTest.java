package Players.Fighters;

import Enemies.Enemy;
import Enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;
    Enemy enemy, strongEnemy;

    @Before
    public void setUp() {
        knight = new Knight("Sir Bornaverie", 5, 10, 2);
        enemy = new Enemy(EnemyType.SQUIRREL);
        strongEnemy = new Enemy(EnemyType.ICESQUIRREL);
    }

    @Test
    public void attack() {
        assertEquals(5, enemy.getHP());
        knight.attack(enemy);
        assertEquals(0,enemy.getHP());
    }

    @Test
    public void cantAttack() {
        assertEquals(5, strongEnemy.getHP());
        knight.attack(strongEnemy);
        assertEquals(5,strongEnemy.getHP());
    }

    @Test
    public void raiseHP() {
        assertEquals(5, knight.getHP());
        knight.raiseHP(5);
        assertEquals(10, knight.getHP());
    }

    @Test
    public void lowerHP() {
        assertEquals(5, knight.getHP());
        knight.lowerHP(2);
        assertEquals(3, knight.getHP());
    }

    @Test
    public void lowerHPCanGoBelowZero(){
        assertEquals(5, knight.getHP());
        knight.lowerHP(7);
        assertEquals(0, knight.getHP());
    }
}