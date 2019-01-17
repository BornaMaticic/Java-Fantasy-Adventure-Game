package Enemies;

import Interfaces.IAttack;
import Players.Player;

public class Enemy implements IAttack {


    private EnemyType enemyType;
    private int HP, ATK, DEF;

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
        this.HP = enemyType.getHP();
        this.ATK = enemyType.getATK();
        this.DEF = enemyType.getDEF();
    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void lowerHP(int lowered){
        HP -= lowered;
        HP = snapToZero(HP);
    }

    public void lowerATK(int lowered){
        ATK -= lowered;
        ATK = snapToZero(ATK);
    }

    public void lowerDEF(int lowered){
        DEF -= lowered;
        DEF = snapToZero(DEF);
    }

    public void attack(IAttack attackee){
        Player attackedPlayer = (Player) attackee;
        int damage = this.ATK - attackedPlayer.getDEF();
        damage = snapToZero(damage);
        attackedPlayer.lowerHP(damage);
    }

    private int snapToZero(int amount){
        if (amount < 0) {amount = 0;}
        return amount;
    }
}
