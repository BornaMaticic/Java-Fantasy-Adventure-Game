package Room;

import Enemies.Enemy;
import Enemies.EnemyType;

import java.util.ArrayList;
import java.util.Random;

public class Room {
    private Enemy enemy;

    public Room(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void generateEnemy(){
        int max = EnemyType.values().length;
        Random random = new Random(max);
        enemy = new Enemy(EnemyType.values()[random.nextInt()]);
    }
}
