package Enemies;

import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Enemy enemy, weakEnemy;
    Knight knight;

    @Before
    public void setUp() {
        enemy = new Enemy(EnemyType.ORC);
        weakEnemy = new Enemy(EnemyType.SQUIRREL);
        knight = new Knight("Sir Bornaverie", 5, 10, 5);

    }

    @Test
    public void lowerHP() {
        assertEquals(50, enemy.getHP());
        enemy.lowerHP(5);
        assertEquals(45, enemy.getHP());
    }

    @Test
    public void lowerATK() {
        assertEquals(8, enemy.getATK());
        enemy.lowerATK(1);
        assertEquals(7, enemy.getATK());
    }

    @Test
    public void lowerDEF() {
        assertEquals(2, enemy.getDEF());
        enemy.lowerDEF(1);
        assertEquals(1, enemy.getDEF());
    }

    @Test
    public void cantlowerHPBelowZero() {
        assertEquals(50, enemy.getHP());
        enemy.lowerHP(55);
        assertEquals(0, enemy.getHP());
    }

    @Test
    public void cantlowerATKBelowZero() {
        assertEquals(8, enemy.getATK());
        enemy.lowerATK(12);
        assertEquals(0, enemy.getATK());
    }

    @Test
    public void cantlowerDEFBelowZero() {
        assertEquals(2, enemy.getDEF());
        enemy.lowerDEF(11);
        assertEquals(0, enemy.getDEF());
    }

    @Test
    public void canAttackPlayer() {
        assertEquals(5, knight.getHP());
        enemy.attack(knight);
        assertEquals(2, knight.getHP());
    }

    @Test
    public void doesntDoNegativeDamage() {
        assertEquals(5, knight.getHP());
        weakEnemy.attack(knight);
        assertEquals(5, knight.getHP());
    }
}