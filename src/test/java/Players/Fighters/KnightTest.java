package Players.Fighters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;

    @Before
    public void setUp() {
        knight = new Knight("Sir Bornaverie", 5, 2, 10);
    }

    @Test
    public void attack() {
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