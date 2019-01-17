package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy(10, 5, 2);
    }

    @Test
    public void lowerHP() {
        assertEquals(10, enemy.getHP());
        enemy.lowerHP(5);
        assertEquals(5, enemy.getHP());
    }

    @Test
    public void lowerATK() {
        assertEquals(5, enemy.getATK());
        enemy.lowerATK(2);
        assertEquals(3, enemy.getATK());
    }

    @Test
    public void lowerDEF() {
        assertEquals(2, enemy.getDEF());
        enemy.lowerDEF(1);
        assertEquals(1, enemy.getDEF());
    }

    @Test
    public void attack() {
    }
}